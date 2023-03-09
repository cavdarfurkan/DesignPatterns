package creational.abstractFactory;

public class WoodenDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("I'm a wooden door");
    }
}
