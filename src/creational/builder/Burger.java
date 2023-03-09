package creational.builder;

public class Burger {

    protected int size;
    protected boolean cheese = false, pepperoni = false, lettuce = false, tomato = false;

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    public int getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    @Override
    public String toString() {
        return "Size: " + this.size + "," +
                " Cheese: " + this.cheese + "," +
                " Pepperoni: " + this.pepperoni + "," +
                " Lettuce: " + this.lettuce + "," +
                " Tomato: " + this.tomato;
    }
}
