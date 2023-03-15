package behavioral.chainofresponsibility;

public abstract class Account {

    private Account successor;
    protected float balance;

    public void setNextLink(Account account) {
        this.successor = account;
    }

    public void pay(float amountToPay) throws Exception {
        if (canPay(amountToPay)) {
            System.out.println("Paid " + amountToPay + " using " + this.getClass().getSimpleName());
        }
        else if (successor != null) {
            System.out.println("Couldn't pay with " + this.getClass().getSimpleName() + " Proceeding...");
            successor.pay(amountToPay);
        }
        else {
            throw new Exception("None of the payment methods have enough balance");
        }
    }

    private boolean canPay(float amount) {
        return balance >= amount;
    }

}
