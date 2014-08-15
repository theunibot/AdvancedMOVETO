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
public class CommandCalibrate implements CommandInterface
{

    @Override
    public String getRoboforth(String routeName)
    {
        return "CALIBRATE";
    }

    @Override
    public boolean isMoveto()
    {
        return  false;
    }
    
}
