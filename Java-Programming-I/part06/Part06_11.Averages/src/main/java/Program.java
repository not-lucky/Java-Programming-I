
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(new GradeRegister(), scanner);
        ui.start();
    }
}
