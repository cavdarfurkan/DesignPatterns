package creational.builder;

public class Main {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder(10)
                .addCheese()
                .addPepperoni()
                .addTomato()
                .build();

        System.out.println(burger);
    }
}