
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user1 = "alex";
        String user2 = "emma";
        String pass1 = "sunshine";
        String pass2 = "haskell";

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals(user1) && password.equals(pass1)) {
            System.out.println("You have successfully logged in!");
            
        } else if (username.equals(user2) && password.equals(pass2)) {
            System.out.println("You have successfully logged in!");
            
        } else {
            System.out.println("Incorrect username or password!");
            
        }
    }
}
