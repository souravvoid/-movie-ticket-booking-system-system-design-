// ================= FILE: UpiPayment.java =================
public class UpiPayment extends Payment {

    
    private String upiId;
    private String upiApp;

    public UpiPayment(String upiId, String upiApp) {
        super("UPI");
        this.upiId = upiId;
        this.upiApp = upiApp;
    }

    
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing UPI payment of Rs." + String.format("%.2f", amount)
                + " via " + this.upiApp + " (UPI ID: " + this.upiId + ")");
        System.out.println("UPI payment successful!");
        return true;
    }
}