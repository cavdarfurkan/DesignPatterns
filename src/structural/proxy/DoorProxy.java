package structural.proxy;

public class DoorProxy implements Door {

    private static final String PASS = "secret_pass";
    private Door door;
    private String password = null;

    @Override
    public void open() {
        if (door == null) {
            this.door = new LabDoor();
        }
        if (password == null) {
            System.out.println("Set a password first!");
            return;
        }

        if (authenticate(password)) {
            this.door.open();
        }
        else {
            System.out.println("Invalid password");
        }
    }

    @Override
    public void close() {
        this.door.close();
    }

    private boolean authenticate(String password) {
        return password.equals(PASS);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
