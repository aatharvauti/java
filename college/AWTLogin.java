import java.awt.event.*;
import java.awt.*;

public class AWTLogin implements ActionListener
{
    Button b1;
    TextField t1,t2;
    Label lb1,lb2,lb3;
    Frame f;
    
    public AWTLogin() {

        f=new Frame("AWT Login Window");
        
        lb1=new Label("USERNAME:");
        lb1.setBounds(5,50,150,30);
        f.add(lb1);
        
        t1=new TextField();
        t1.setBounds(200,50,150,30);
        f.add(t1);
        
        t2=new TextField();
        t2.setBounds(200,80,150,30);
        f.add(t2);
        
        lb2=new Label("PASSWORD:");
        lb2.setBounds(5,80,150,30);
        f.add(lb2);
        
        lb3=new Label("Result:");
        lb3.setBounds(90,140,150,30);
        f.add(lb3);
        
        b1=new Button("Login");
        b1.setBounds(90,200,100,30);
        f.add(b1);
        b1.addActionListener(this);
        
        f.addWindowListener
        (
            new WindowAdapter() {     
                public void windowclosing(WindowEvent we) {
                    System.exit(0);
                }
            }
        );
        
        f.setLayout(null);
        f.setSize(600,500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        int c = 0;

        if(e.getSource().equals(b1)) {
            
            if(t1.getText().equals("ATHARVA")&&(t2.getText().equals("15523"))) {
                lb3.setText(String.valueOf("Welcome Back!"));
            }
            else {
            lb3.setText(String.valueOf("Who the fuck are you?"));
            }
        }
    }
    public static void main(String args[]) {
        AWTLogin t = new AWTLogin();
    }
}

