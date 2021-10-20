
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negno = 0;

        while (true) {

            System.out.println("Give a number:");

            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }

            if (num < 0) {
                negno = negno + 1;
            }
        }

        System.out.println("Number of numbers: " + negno);

    }
}
