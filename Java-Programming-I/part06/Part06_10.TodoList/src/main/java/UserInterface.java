import java.util.*;

public class UserInterface {
	private TodoList todoList;
	private Scanner scanner;

	public UserInterface(TodoList todoList, Scanner scanner) {
		this.todoList = todoList;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.println("Command: ");
			String command = scanner.nextLine();
			
			if (command.equals("stop")) {
				break;

			} else if (command.equals("add")) {
				System.out.println("To add: ");
				String toAdd = scanner.nextLine();
				
				this.todoList.add(toAdd);

			} else if (command.equals("list")) {
				this.todoList.print();

			} else {
				System.out.println("Which one is removed? ");
				int toRemove = Integer.valueOf(scanner.nextLine());
				
				this.todoList.remove(toRemove);
			}
		}
	}
}