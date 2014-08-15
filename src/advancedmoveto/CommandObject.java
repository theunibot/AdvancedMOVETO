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
public class CommandObject
{

    private String x;
    private String y;
    private String z;
    private String pitch;
    private String yaw;
    private String roll;

    public CommandObject(String x, String y, String z, String pitch, String yaw, String roll)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
    }

    public String getRoboforth(String routeName)
    {
        return "DECIMAL " + formatString(roll) + " " + formatString(yaw) + " " + formatString(pitch) + " " + convert(z) + " " + convert(y) + " " + convert(x) + " " + routeName + " 1 LINE DLD";
    }

    private String convert(String s)
    {
        double d = Double.parseDouble(s);
        //convert in to mm
        d = d * 25.4;
        return formatDouble(d);
    }

    public static String formatDouble(double d)
    {

        return String.format("%.1f", d);
    }

    public static String formatString(String s)
    {        
        if (s.contains("."))
        {
            System.out.println(s);
            String[] split = s.split("\\.");
            String end = split[1].substring(0, 1);
            s = split[0] + "." + end;
        }
        System.out.println(s);
        return s;
    }

    public String getX()
    {
        return x;
    }

    public String getY()
    {
        return y;
    }

    public String getZ()
    {
        return z;
    }

    public String getPitch()
    {
        return pitch;
    }

    public String getYaw()
    {
        return yaw;
    }

    public String getRoll()
    {
        return roll;
    }

}
