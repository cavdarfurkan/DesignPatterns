package structural.decorator;

public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee, 2, "milk");
    }
}
