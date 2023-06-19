import javax.swing.*;

        public class Main {

            public static void main(String[] args) {

                System.out.println("WELCOME");
                JFrame frame = new JFrame("Calendar");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI myGUI = new GUI(600, 400);
                frame.add(myGUI);
                frame.pack();
                frame.setVisible(true);

            Login login1 = new Login();
            login1.getUsername();
            login1.getPassword();
        }}


