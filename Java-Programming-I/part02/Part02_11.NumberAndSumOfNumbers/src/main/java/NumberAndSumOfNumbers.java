
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfInput = 0;
        int sum = 0;

        while (true) {

            System.out.println("Give a number:");

            int num = Integer.valueOf(scanner.nextLine());

            if (num != 0) {
                noOfInput = noOfInput + 1;
                sum = sum + num;

            } else {
                break;
            }

        }

        System.out.println("Average of the numbers: " + (1.0 * sum / noOfInput));

    }
}
