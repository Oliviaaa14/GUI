import java.util.Scanner;

public class Login {
    Scanner input = new Scanner(System.in);
        String username;
        String password;

        public void setUsername() {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Username : ");
            username = input1.next();
        }
        public void setPassword() {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Password : ");
            password = input2.next();
        }
        public String getPassword() {
            return password;

        }
        public String getUsername() {
            return username;

        }
}
