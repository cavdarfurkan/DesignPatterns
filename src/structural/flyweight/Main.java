package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        TeaShop shop = new TeaShop(teaMaker);

        shop.takeOrder("less sugar", 1);
        shop.takeOrder("more milk", 3);
        shop.takeOrder("without sugar", 5);
        shop.takeOrder("more milk", 4);

        shop.serve();
    }
}
