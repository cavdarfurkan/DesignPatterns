package structural.proxy;

public class LabDoor implements Door {
    @Override
    public void open() {
        System.out.println("Lab door is opening");
    }

    @Override
    public void close() {
        System.out.println("Lab door is closing");
    }
}
