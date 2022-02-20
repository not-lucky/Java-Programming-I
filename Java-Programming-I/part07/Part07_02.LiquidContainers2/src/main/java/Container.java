public class Container {
	private int first;
	private int max;

	public Container() {
		first = 0;
		max = 100;
	}

	public void set(int amount) {
		first = amount;
	}

	public int contains() {
		return first;
	}

	public void add(int amount) {
		if (amount < 0) {
			return ;
		}

		first += amount;

		if (first > max) {
			first = max;
		}
	}

	public void remove(int amount) {
		if (amount < 0) {
			return ;
		}

		first -= amount;

		if (first < 0) {
			first = 0;
		}
	}

	public String toString() {
		return first + "/100";
	}
}