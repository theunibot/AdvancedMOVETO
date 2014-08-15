/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedmoveto;

/**
 *
 * @author kyle
 */
public class CommandThread extends Thread
{

    R12Operations r12o = null;

    @Override
    public void run()
    {
        r12o = R12Operations.getInstance();
        boolean initSuccess = r12o.init();
        if (initSuccess)
        {
            Main.responsesToAdd.add(new ResponseObject(true, "Inits Succesful"));
            Main.responsesLatch.unlock();
        }
        else
        {
            Main.responsesToAdd.add(new ResponseObject(false, "Inits Failed"));
            Main.responsesLatch.unlock();
        }

        while (true)
        {
            Main.commandsLatch.await();
            boolean lock = false;

            CommandInterface ci = null;
            synchronized (Main.commandsToAdd)
            {
                ci = Main.commandsToAdd.get(0);
                Main.commandsToAdd.remove(0);
                lock = (Main.commandsToAdd.size() == 0);
            }

            writeRoboforth(ci);

            if (lock)
            {
                Main.commandsLatch.lock();
            }
        }
    }

    private void writeRoboforth(CommandInterface ci)
    {
        try
        {
            if (ci.getType() == CommandType.COMMAND)
            {
                addResponse(new ResponseObject(true, "Starting ROBOFORTH"));
                r12o.write("ROUTE AMT");
                addResponse(r12o.getResponse(""));
                r12o.write("1 RESERVE");
                addResponse(r12o.getResponse(""));
                r12o.write("LEARN");
                addResponse(r12o.getResponse(""));
                r12o.write(ci.getRoboforth("AMT"));
                addResponse(r12o.getResponse(""));
                r12o.write("AMT RUN");
                addResponse(r12o.getResponse(""));
            }
            else if(ci.getType() == CommandType.START)
            {
                r12o.write("ROBOFORTH");
                addResponse(r12o.getResponse(""));
                r12o.write("START");
                addResponse(r12o.getResponse(""));
            }
            else
            {
                r12o.write(ci.getRoboforth(null));
                addResponse(r12o.getResponse(""));
            }
        }
        catch (Exception ex)
        {
            addResponse(new ResponseObject(false, "Something went wrong with the writing of Roboforth"));
        }
    }

    private void addResponse(ResponseObject ro)
    {
        synchronized (Main.responsesToAdd)
        {
            Main.responsesToAdd.add(ro);
            Main.responsesLatch.unlock();
        }
    }
}
