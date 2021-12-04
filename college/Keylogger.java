// 01 Auti Atharva Sachin, CYSE, SE15

import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 

public class Keylogger extends Applet implements KeyListener 
{ 
    String msg="";

    public void init() { 
        addKeyListener(this); 
    }

    public void keyPressed(KeyEvent k) { 
        showStatus("KEY IS PRESSED"); 
    }

    public void keyReleased(KeyEvent k) {
        showStatus("KEY IS RELEASED");
    }

    public void keyTyped(KeyEvent k) {
        msg = msg + k.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) { 
        g.drawString(msg, 20, 40);
    }
}
