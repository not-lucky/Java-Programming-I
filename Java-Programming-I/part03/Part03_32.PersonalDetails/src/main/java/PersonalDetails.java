
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfAge = 0;
        String longestName = "";

        int noOfInputs = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] split = input.split(",");

            if (split[0].length() > longestName.length()) {
                longestName = split[0];
            }

            sumOfAge += Integer.valueOf(split[1]);

            noOfInputs++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sumOfAge / noOfInputs);
        
    }
}
