import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("CALENDAR");
        JFrame frame = new JFrame("Calendar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myGUI = new GUI(600, 400);
        frame.add(myGUI);
        frame.pack();
        frame.setVisible(true);



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
                System.out.println("User registration successful! " );
                System.out.println("Welcome"+ " "+ username  + " " +"!");
            } else {
                System.out.println("Username or password incorrect");
            }
        }





        // System.out.print(BasicCalendar);

            }}
