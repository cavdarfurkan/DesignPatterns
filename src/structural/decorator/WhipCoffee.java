package structural.decorator;

public class WhipCoffee extends CoffeeDecorator {
    public WhipCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee, 5, "whip");
    }
}
