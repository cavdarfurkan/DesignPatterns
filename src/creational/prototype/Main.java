package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Sheep original = new Sheep("Jolly");

        Sheep cloned = original.clone();
        cloned.setName("Dolly");

        System.out.println(original.getName() + " " + original.getCategory());
        System.out.println(cloned.getName() + " " + cloned.getCategory());
    }
}