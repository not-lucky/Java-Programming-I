import java.util.*;

public class Stack {
	private ArrayList<String> stack;

	public Stack() {
		this.stack = new ArrayList<>();
	}

	public boolean isEmpty() {
		return this.stack.isEmpty();
	}

	public void add(String value) {
		this.stack.add(value);
	}

	public ArrayList<String> values() {
		return this.stack;
	}

	public String take() {
		int size = this.stack.size();
		String take = this.stack.get(size - 1);

		this.stack.remove(size - 1);
		return take;
	}
}