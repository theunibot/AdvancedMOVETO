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
public class ResponseObject
{
    private boolean success;
    private String message;

    public ResponseObject(boolean success, String message)
    {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public String getMessage()
    {
        return message;
    }
    
    
}
