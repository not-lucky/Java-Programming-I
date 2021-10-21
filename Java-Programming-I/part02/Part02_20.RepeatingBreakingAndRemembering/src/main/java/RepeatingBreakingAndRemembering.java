
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers:");

        int num = 0;
        int sumno = 0;
        int nono = 0;
        int evenno = 0;
        int oddno = 0;

        while (true) {
            num = Integer.valueOf(scanner.nextLine());

            if (num != -1) {
                sumno = sumno + num;
                nono = nono + 1;

                if (num % 2 == 0) {
                    evenno = evenno + 1;
                } else {
                    oddno = oddno + 1;
                }
            } else {
                break;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumno);
        System.out.println("Numbers: " + nono);
        System.out.println("Average: " + (1.0 * sumno / nono));
        System.out.println("Even: " + evenno);
        System.out.println("Odd: " + oddno);

    }
}
