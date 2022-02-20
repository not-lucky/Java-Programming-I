
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " +this.name+" is empty.";
        }

        int size = elements.size();
        String collectionElements = "";

        for (String element: this.elements) {
            if (size == 1) {
                collectionElements = element;
            } else {
                collectionElements = collectionElements + element +"\n";
            }
        }

        if (size == 1) {
            return "The collection " +this.name+ " has " +size+ " element:\n" + collectionElements;
        }

        return "The collection " +this.name+ " has " +size+ " elements:\n" + collectionElements;
    }
    
}
