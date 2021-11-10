
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int price() {
        return this.princePerSquare * this.squares;
    }

    public int priceDifference(Apartment compared) {
        int priceDifference = this.price() - compared.price();
        if (this.price() > compared.price()) {
            return priceDifference;
        } else {
            return priceDifference * -1;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price() > compared.price()) {
            return true;
        } else {
            return false;
        }
    }
}
