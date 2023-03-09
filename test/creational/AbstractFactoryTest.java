package creational;

import creational.abstractFactory.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    Door door = null;
    DoorFittingExpert expert = null;

    @Test
    @DisplayName("Test WoodenDoorFactory")
    public void testMakeWoodenDoor() {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        door = woodenDoorFactory.makeDoor();
        expert = woodenDoorFactory.makeFittingExpert();

        Assertions.assertNotNull(door);
        Assertions.assertTrue(door instanceof WoodenDoor);

        Assertions.assertNotNull(expert);
        Assertions.assertTrue(expert instanceof Carpenter);
    }

    @Test
    @DisplayName("Test IronDoorFactory")
    public void testMakeIronDoor() {
        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        door = ironDoorFactory.makeDoor();
        expert = ironDoorFactory.makeFittingExpert();

        Assertions.assertNotNull(door);
        Assertions.assertTrue(door instanceof IronDoor);

        Assertions.assertNotNull(expert);
        Assertions.assertTrue(expert instanceof Welder);
    }

    @AfterEach
    public void descriptions() {
        door.getDescription();
        expert.getDescription();
    }
}
