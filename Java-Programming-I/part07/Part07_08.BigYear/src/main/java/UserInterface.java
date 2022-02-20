import java.util.*;

public class UserInterface {
	private ArrayList<Bird> birds;
	private Scanner scanner;

	public UserInterface(ArrayList<Bird> birds, Scanner scanner) {
		this.birds = birds;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.println("? ");
			String input = scanner.nextLine();

			if (input.equals("Add")) {
				add(scanner);
			} else if (input.equals("Observation")) {
				observation(scanner);
			} else if (input.equals("All")) {
				printAll();
			} else if (input.equals("One")) {
				printOne(scanner);
			} else {
				return;
			}
		}

	}

	public void add(Scanner scanner) {
		System.out.println("Name: ");
		String name = scanner.nextLine();
		System.out.println("Name in Latin: ");
		String latinName = scanner.nextLine();
		birds.add(new Bird(name, latinName));
	} 

	public void observation(Scanner scanner) {
		System.out.println("Bird? ");
		String name = scanner.nextLine();
		
		for (Bird bird: birds) {
			if (name.equals(bird.getName())) {
				bird.increaseObservations();
				return;
			}
		}

		System.out.println("Not a bird!");
		return;
	}

	public void printAll() {
		for (Bird bird: birds) {
			System.out.println(bird);
		}
	}

	public void printOne(Scanner scanner) {
		System.out.println("Bird? ");
		String name = scanner.nextLine();
		
		for (Bird bird: birds) {
			if (name.equals(bird.getName())) {
				System.out.println(bird);
			}
		}
	}
}