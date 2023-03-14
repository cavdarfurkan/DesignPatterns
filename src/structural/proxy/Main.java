package structural.proxy;

public class Main {
    public static void main(String[] args) {
        DoorProxy doorProxy = new DoorProxy();

        doorProxy.open();

        doorProxy.setPassword("password");
        doorProxy.open();

        doorProxy.setPassword("secret_pass");
        doorProxy.open();
        doorProxy.close();
    }
}
