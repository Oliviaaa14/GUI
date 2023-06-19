 import javax.swing.*;
import java.awt.*;
 import java.awt.event.ActionEvent;

 public class GUI extends JPanel  {
    // canvas for other GUI widgets

    JButton button1;
    JButton button2;

    public GUI(int width, int height) {
        System.out.println("SEQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("Sign in");
        button1.setBounds(170, 200, 100, 40);
        button2 = new JButton("Sign up");
        button2.setBounds(280, 200, 100, 40);
        button1.setBackground(Color.BLUE);
        add(button1);
        button2.setBackground(Color.BLUE);
        add(button2);

    }
    public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Sign in page")) {
                System.out.println("click");

            }
        }
    }



