/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advancedmoveto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kyle
 */
public class Main
{

    public static List<CommandInterface> commandsToAdd = null;
    public static List<ResponseObject> responsesToAdd = null;
    public static Latch commandsLatch = null;
    public static Latch responsesLatch = null;
    public static GUI gui = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        commandsToAdd = Collections.synchronizedList(new ArrayList<CommandInterface>());
        responsesToAdd = Collections.synchronizedList(new ArrayList<ResponseObject>());
        commandsLatch = new Latch();
        responsesLatch = new Latch();
        GUIThread guiThread = new GUIThread();
        guiThread.start();        
        CommandThread cmdThread = new CommandThread();
        cmdThread.start();
    }                
    
}
