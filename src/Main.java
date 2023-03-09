import creational.factoryMethod.DevelopmentManager;
import creational.factoryMethod.MarketingManager;
import creational.simpleFactory.Door;
import creational.simpleFactory.DoorFactory;

public class Main {
    public static void main(String[] args) {

        // Creational Design Patterns
        simpleDoorFactory();
        factoryMethod();
    }

    private static void simpleDoorFactory() {
        System.out.println("-----Simple Door Factory-----");
        Door door = DoorFactory.makeDoor(100, 100);
        System.out.println("Width: " + door.getWidth());
        System.out.println("Height: " + door.getHeight());
        System.out.println("--------------------");
    }

    private static void factoryMethod() {
        System.out.println("-----Factory Method-----");
        DevelopmentManager devManager = new DevelopmentManager();
        devManager.takeInterview();

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterview();
        System.out.println("--------------------");
    }
}
