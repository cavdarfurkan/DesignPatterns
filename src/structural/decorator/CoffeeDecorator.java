package structural.decorator;

public class CoffeeDecorator implements Coffee {

    private final Coffee decoratedCoffee;
    private final int cost;
    private final String description;

    public CoffeeDecorator(Coffee decoratedCoffee, int cost, String description) {
        this.decoratedCoffee = decoratedCoffee;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", " + description;
    }
}
