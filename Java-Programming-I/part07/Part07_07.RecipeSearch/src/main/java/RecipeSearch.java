
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String filename = scanner.nextLine();
        ArrayList<Recipe> recipes = readFromFile(filename);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                list(recipes);
            } else if (command.equals("find name")) {
                findName(recipes, scanner);
            } else if (command.equals("find cooking time")) {
                findTime(recipes, scanner);
            } else if (command.equals("stop")) {
                return;
            } else if (command.equals("find ingredient")) {
                findIngredient(recipes, scanner);
            }
        }
    }

    public static void list(ArrayList<Recipe> recipes) {
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }

    public static void findName(ArrayList<Recipe> recipes, Scanner scanner) {
        System.out.println("Searched word: ");
        String name = scanner.nextLine();
        
        System.out.println("Recipes: ");
        for (Recipe recipe: recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
                
            }
        }
    }

    public static void findTime(ArrayList<Recipe> recipes, Scanner scanner) {
        System.out.println("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Recipes: ");
        for (Recipe recipe: recipes) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(recipe);
                
            }
        }
    }

    public static void findIngredient(ArrayList<Recipe> recipes, Scanner scanner) {
        System.out.println("Ingredient: ");
        String ingredient = scanner.nextLine();
        
        System.out.println("Recipes: ");
        for (Recipe recipe: recipes) {
            for (String ingr: recipe.getIngredients()) {
                if (ingr.equals(ingredient)) {
                    System.out.println(recipe);
                }
            }
        }    
    }

    public static ArrayList<Recipe> readFromFile(String filename) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();
        String recipeName;
        int time;
        
        try (Scanner reader = new Scanner(Paths.get(filename))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                if (!line.isEmpty()) {
                    ingredients.add(line);

                } else {
                    recipeName = ingredients.get(0);
                    time = Integer.valueOf(ingredients.get(1));

                    ingredients.remove(0);
                    ingredients.remove(0);

                    recipes.add(new Recipe(recipeName, time, ingredients));
                    ingredients.clear();
                }
            }

            if (!ingredients.isEmpty()) {
                recipeName = ingredients.get(0);
                time = Integer.valueOf(ingredients.get(1));

                ingredients.remove(0);
                ingredients.remove(0);

                recipes.add(new Recipe(recipeName, time, ingredients));
                ingredients.clear();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return recipes;
    }
}
