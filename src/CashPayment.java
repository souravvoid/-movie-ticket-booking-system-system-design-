// ================= FILE: CashPayment.java =================
public class CashPayment extends Payment {

    // OOP Concept: Inheritance (CashPayment is a type of Payment)
    private String cashierName;

    public CashPayment(String cashierName) {
        super("CASH");
        this.cashierName = cashierName;
    }

    // OOP Concept: Runtime Polymorphism (overrides abstract pay() from Payment)
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing cash payment of Rs." + String.format("%.2f", amount)
                + " accepted by cashier " + this.cashierName);
        System.out.println("Cash payment successful!");
        return true;
    }
}