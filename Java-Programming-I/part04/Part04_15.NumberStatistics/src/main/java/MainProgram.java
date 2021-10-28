
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allSum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }

            allSum.addNumber(input);

            if (input % 2 == 0) {
                evenSum.addNumber(input);
            } else {
                oddSum.addNumber(input);
            }


        }

        System.out.println("Sum: " + allSum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
    }
}