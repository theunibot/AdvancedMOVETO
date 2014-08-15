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
public class GUIThread extends Thread
{
    private volatile boolean killThread = false;
    @Override
    public void run()
    {
        Main.gui = new GUI(); 
        Main.gui.setVisible(true);
        GUILoaderThread guiLoaderThread = new GUILoaderThread();
        guiLoaderThread.start();
    }        
    
}
