import java.applet.*;
import java.awt.*;

public class AppletMessage extends Applet 
{
    public void paint(Graphics g)
    {
        String msg="Hello, World! I am Atharva. Welcome to my Applet";
        g.drawString(msg, 80, 160);
    }    
}


