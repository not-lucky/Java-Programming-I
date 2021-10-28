public class Gauge {
	private int value;

	public Gauge() {
		this.value = 0;
	}

	public void increase() {
		if (this.value > 4) {
			return;
		}

		this.value++;
	}

	public void decrease() {
		if (this.value < 1) {
			return;
		}

		this.value--;
	}

	public int value() {
		return this.value;
	}

	public boolean full() {
		return this.value == 5;
	}
}