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
public class CommandHome implements CommandInterface
{

    @Override
    public String getRoboforth(String routeName)
    {
        return "HOME";
    }

    @Override
    public CommandType getType()
    {
        return CommandType.HOME;
    }
    
}
