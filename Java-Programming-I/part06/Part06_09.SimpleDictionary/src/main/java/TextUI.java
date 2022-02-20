import java.util.*;

public class TextUI {
	private Scanner scanner;
	private SimpleDictionary dictionary;

	public TextUI(Scanner scanner, SimpleDictionary dictionary) {
		this.scanner = scanner;
		this.dictionary = dictionary;
	}

	public void start() {
		while (true) {
			System.out.println("Command: ");
			String command = scanner.nextLine();

			if (command.equals("end")) {
				inputEnd();
				break;

			} else if (command.equals("add")) {
				inputAdd();

			} else if (command.equals("search")) {
				inputSearch();

			} else {
				System.out.println("Unknown command");
			}
		}
	}

	public void inputEnd() {
		System.out.println("Bye Bye!");
	}

	public void inputAdd() {
		System.out.println("Word: ");
		String word = scanner.nextLine();
		System.out.println("Translation: ");
		String translation = scanner.nextLine();
		
		this.dictionary.add(word, translation);
	}

	public void inputSearch() {
		System.out.println("To be translated: ");
		String toTranslate = scanner.nextLine();
		String translation = this.dictionary.translate(toTranslate);
		
		
		if (!(translation == null)) {
			System.out.println("Translation: " + this.dictionary.translate(toTranslate));
			return;
		}
		
		System.out.println("Word " + toTranslate + " was not found");
		
	}
}