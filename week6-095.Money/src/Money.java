
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        return new Money(euros + added.euros, cents + added.cents);
    }

    public boolean less(Money compared) {
        if (euros > compared.euros) {
            return false;
        }
        if (euros == compared.euros) {
            if (cents > compared.cents) {
                return false;
            }
        }
        return true;
    }

    public Money minus(Money decremented) {
        int e = this.euros;
        int c = this.cents;
        if (this.cents < decremented.cents) {
            e--;
            c += 100;
        }

        Money difference = new Money(e - decremented.euros, c - decremented.cents);

        if (difference.less(new Money(0, 0))) {
            return new Money(0, 0);
        }
        return difference;
    }

}
