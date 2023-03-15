package behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(100);
        Paypal paypal = new Paypal(200);
        Bitcoin bitcoin = new Bitcoin(300);

        bank.setNextLink(paypal);
        paypal.setNextLink(bitcoin);

        try {
            bank.pay(255);
        } catch (Exception e) {
            System.out.println("Insufficient amount of money");
        }
    }
}
