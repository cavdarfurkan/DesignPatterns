package creational;

import creational.simpleFactory.Door;
import creational.simpleFactory.DoorFactory;
import creational.simpleFactory.WoodenDoor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {

    @Test
    public void makeDoorTest() {
        Door door = DoorFactory.makeDoor(100, 200);
        Assertions.assertNotNull(door);
        Assertions.assertTrue(door instanceof WoodenDoor);
    }
}
