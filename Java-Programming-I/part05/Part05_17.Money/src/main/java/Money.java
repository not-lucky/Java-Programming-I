
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuro = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents > 99) {
            newCents -= 100;
            newEuro++;
        }
        
        Money newMoney = new Money(newEuro, newCents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {

        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() <= compared.euros() && this.cents() < compared.cents()) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int newEuro = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newEuro >= 0) {
            if (newCents < 0) {
                newEuro--;
                newCents += 100;
            }
        } else {            
            newEuro = 0;
            newCents = 0;
        }

        Money newMoney = new Money(newEuro, newCents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }
}
