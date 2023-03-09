import creational.simpleFactory.Door;
import creational.simpleFactory.DoorFactory;

public class Main {
    public static void main(String[] args) {

        // Simple Door Factory
        Door door = DoorFactory.makeDoor(100, 100);
        System.out.println("Width: " + door.getWidth());
        System.out.println("Height: " + door.getHeight());
    }
}
