public class CashPayment extends Payment {

    private String cashierName;

    public CashPayment(double amount, String paymentMethod, String cashierName) {
        super(amount, paymentMethod);
        this.cashierName = cashierName;
    }

    public String getCashierName() {
        return cashierName;
    }

    @Override
    public void processPayment() {
        // Simulate cash payment processing
        System.out.println("Processing cash payment of $" + String.format("%.2f", getAmount()));
        System.out.println("Cashier: " + cashierName);
        setSuccess(true);
        System.out.println("Cash payment received successfully!");
    }
}