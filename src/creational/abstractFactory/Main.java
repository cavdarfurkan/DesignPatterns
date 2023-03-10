package creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();

        Door woodenDoor = woodenDoorFactory.makeDoor();
        DoorFittingExpert carpenter = woodenDoorFactory.makeFittingExpert();

        woodenDoor.getDescription();
        carpenter.getDescription();

        System.out.println();

        IronDoorFactory ironDoorFactory = new IronDoorFactory();

        Door ironDoor = ironDoorFactory.makeDoor();
        DoorFittingExpert welder = ironDoorFactory.makeFittingExpert();

        ironDoor.getDescription();
        welder.getDescription();

    }
}