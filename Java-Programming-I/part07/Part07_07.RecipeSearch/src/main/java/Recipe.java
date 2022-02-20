import java.util.*;
import java.io.File;

public class Recipe {
	private String name;
	private int time;
	private ArrayList<String> ingredients;

	public Recipe(String name, int time, ArrayList<String> ingredients) {
		this.name = name;
		this.time = time;
		this.ingredients = new ArrayList<>();
		for (String ingr: ingredients) {
			this.ingredients.add(ingr);
		}
	}

	public String getName() {
		return name;
	}

	public int getTime() {
		return time;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public String toString() {
		return name + ", cooking time: " + time;
	}
}