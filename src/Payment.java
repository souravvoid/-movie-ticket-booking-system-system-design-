// ================= FILE: Payment.java =================
public abstract class Payment {

    // OOP Concept: Encapsulation (field is private, exposed via getter)
    // OOP Concept: Abstraction (Payment exposes behaviour without implementation details)
    private String paymentMethod;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public abstract boolean pay(double amount);
}