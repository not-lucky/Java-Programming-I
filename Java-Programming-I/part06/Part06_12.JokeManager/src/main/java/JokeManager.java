import java.util.*;

public class JokeManager {
	private ArrayList<String> jokes;

	public JokeManager() {
		this.jokes = new ArrayList<>();
	}

	public void addJoke(String joke) {
		this.jokes.add(joke);
	}

	public String drawJoke() {
		if (this.jokes.size() == 0) {
			return "Jokes are in short supply.";
		}

        Random rand = new Random();
        int index = rand.nextInt(this.jokes.size());

        return this.jokes.get(index);
	}

	public void printJokes() {
		for (String joke: jokes) {
			System.out.println(joke);
		}
	}
}