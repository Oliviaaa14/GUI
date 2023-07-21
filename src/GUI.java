 import javax.swing.*;
import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.util.Scanner;

 public class GUI extends JPanel implements ActionListener {
    // canvas for other GUI widgets

    JButton buttonSignin;
    JButton buttonSignup;


    public GUI(int width, int height) {
        System.out.println("WELCOME!!!");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        buttonSignin = new JButton("Sign in");
        buttonSignin.setBounds(170, 200, 100, 40);
        buttonSignup = new JButton("Sign up");
        buttonSignup.setBounds(280, 200, 100, 40);
        buttonSignin.setBackground(Color.MAGENTA);
        buttonSignin.addActionListener(this);
        add(buttonSignin);
        buttonSignup.setBackground(Color.magenta);
        add(buttonSignup);

    }

    public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Sign in ")) {
                Login login = new Login();
                Scanner scanner = new Scanner(System.in);
                boolean passwordOK = false;
                while (!passwordOK) {
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();

                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();


                    if (login.isValid(username, password)) {
                        passwordOK =true;
                        System.out.println("User registration successful! ");
                    } else {
                        System.out.println("Username or password incorrect");

                    }
                }



            }
        }
    }