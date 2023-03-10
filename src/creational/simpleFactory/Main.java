package creational.simpleFactory;

public class Main {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100, 200);
        System.out.println("Width: " + door.getWidth());
        System.out.println("Height: " + door.getHeight());

        Door door2 = DoorFactory.makeDoor(50, 100);
        System.out.println("Width: " + door2.getWidth());
        System.out.println("Height: " + door2.getHeight());
    }
}