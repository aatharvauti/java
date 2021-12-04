import java.awt.*;
import java.applet.*;

public class GraphicsApplet extends Applet 
{
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK); // Boundary Color
        g.drawOval(80, 70, 150, 150); // Outline of emote

        g.fillOval(120, 120, 15, 15); // left eye
        g.fillOval(170, 120, 15, 15); // right eye

        g.drawArc(130, 180, 50, 20, 180, 180); // smile arc
        
    }
}
