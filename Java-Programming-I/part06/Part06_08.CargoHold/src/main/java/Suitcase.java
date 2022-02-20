import java.util.*;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }



    public int totalWeight() {
        int totalWeight = 0;
        for (Item item: items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight)
            this.items.add(item);
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" +this.totalWeight()+ " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }

    public String listItems() {
        String items = "";
        for (Item item: this.items) {
            items = items + item + "\n";
        }

        return items;
    }

    public Item heaviestItem() {
        if (this.items.size() == 0) {
            return null;
        }

        Item heaviestItem = this.items.get(0);
        for (Item item: this.items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }
}