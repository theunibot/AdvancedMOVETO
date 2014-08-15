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
public class GUILoaderThread extends Thread
{

    @Override
    public void run()
    {
        while (true)
        {
            Main.responsesLatch.await();
            ResponseObject ro = null;
            boolean lock = false;
            synchronized (Main.responsesToAdd)
            {
                ro = Main.responsesToAdd.get(0);
                Main.responsesToAdd.remove(0);
                lock = (Main.responsesToAdd.size() == 0);
            }
            if (ro.isSuccess())
            {
                Main.gui.addText(ro.getMessage());
            }
            else
            {
                Main.gui.addText("ERROR: " + ro.getMessage());
            }
            if (lock)
            {
                Main.responsesLatch.lock();
            }
        }
    }
}
