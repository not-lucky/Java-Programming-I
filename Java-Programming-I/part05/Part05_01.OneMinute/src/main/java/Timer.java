public class Timer {
	private int hundredths;
	private int seconds;

	public Timer() {
		this.hundredths = 0;
		this.seconds = 0;
	}

	public void advance() {
		this.hundredths++;
		if (this.hundredths == 100) {
			this.hundredths = 0;
			this.seconds++;
			if (this.seconds == 60) {
				this.seconds = 0;
			}
		}
	}

	public String getHundredths() {
		if (this.hundredths < 10) {
			return "0" + this.hundredths;
		}

		return "" + this.hundredths;
	}

	public String getSeconds() {
		if (this.seconds < 10) {
			return "0" + this.seconds;
		}

		return "" + this.seconds;
	}

	public String toString() { 
		return getSeconds() + ":" + getHundredths();
		
		
	}
}