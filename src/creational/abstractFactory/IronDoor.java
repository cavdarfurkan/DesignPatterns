package creational.abstractFactory;

public class IronDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("I'm a iron door");
    }
}
