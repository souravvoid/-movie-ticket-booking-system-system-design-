// ================= FILE: CardPayment.java =================
public class CardPayment extends Payment {

    // OOP Concept: Inheritance (CardPayment is a type of Payment)
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CardPayment(String cardNumber, String expiryDate, String cvv) {
        super("CARD");
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    // OOP Concept: Runtime Polymorphism (overrides abstract pay() from Payment)
    // Deliberately returns false to simulate a failed payment for testing edge case 2.
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing card payment of Rs." + String.format("%.2f", amount)
                + " (Card ending in " + this.cardNumber.substring(this.cardNumber.length() - 4) + ")");
        System.out.println("Card payment FAILED! Insufficient funds.");
        return false;
    }
}