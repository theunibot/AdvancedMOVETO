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
public class CommandGrip implements CommandInterface
{

    @Override
    public String getRoboforth(String routeName)
    {
        return "GRIP";
    }

    @Override
    public CommandType getType()
    {
        return CommandType.GRIP;
    }
    
}
