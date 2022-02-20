import java.util.Scanner;

public class UserInterface {
    private Container first;
    private Container second;
    private Scanner scan;

    public UserInterface(Container first, Container second, Scanner scanner) {
        this.first = first;
        this.second = second;
        this.scan = scanner;
    }

    public void start() {
        while (true) {

            System.out.println("First: " + first);
            System.out.println("Second: " + second);            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);

            } else if (command.equals("move")) {
                if (first.contains() - amount < 0) {
                    second.add(first.contains());
                    first.set(0);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }

            } else {
                second.remove(amount);
            }
        }
    }
}

