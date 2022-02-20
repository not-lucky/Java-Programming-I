import java.util.*;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase: this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight)
            this.suitcases.add(suitcase);
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            System.out.println(suitcase.listItems());           
        }
    }
}