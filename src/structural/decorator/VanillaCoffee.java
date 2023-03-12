package structural.decorator;

public class VanillaCoffee extends CoffeeDecorator {
    public VanillaCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee, 3, "vanilla");
    }
}
