public class UpiPayment extends Payment {

    private String upiId;
    private String upiApp;

    public UpiPayment(double amount, String paymentMethod, String upiId, String upiApp) {
        super(amount, paymentMethod);
        this.upiId = upiId;
        this.upiApp = upiApp;
    }

    public String getUpiId() {
        return upiId;
    }

    public String getUpiApp() {
        return upiApp;
    }

    @Override
    public void processPayment() {
        // Simulate UPI payment processing
        System.out.println("Processing UPI payment of $" + String.format("%.2f", getAmount()));
        System.out.println("UPI ID: " + upiId);
        System.out.println("App: " + upiApp);
        setSuccess(true);
        System.out.println("UPI payment successful! Payment confirmed via " + upiApp);
    }
}