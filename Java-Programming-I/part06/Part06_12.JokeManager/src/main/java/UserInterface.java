import java.util.*;

public class UserInterface {
	private JokeManager jokes;
	private Scanner scanner;

	public UserInterface(JokeManager jokes, Scanner scanner) {
		this.jokes = jokes;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.println("Commands:");
			System.out.println(" 1 - add a joke");
			System.out.println(" 2 - draw a joke");
			System.out.println(" 3 - list jokes");
			System.out.println(" X - stop");
			
			String input = scanner.nextLine();

			if (input.equals("X")) {
				break;
			}
			
			command(input);
		}

	}

	public void command(String command) {
		
		if (command.equals("1")) {
	        System.out.println("Write the joke to be added:");
	        String joke = scanner.nextLine();

			this.jokes.addJoke(joke);

		} else if (command.equals("2")) {
			System.out.println(this.jokes.drawJoke());

		} else {
			System.out.println("Printing the jokes.");
			this.jokes.printJokes();
		}
	}
}