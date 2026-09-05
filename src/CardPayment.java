public class CardPayment extends Payment {

    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CardPayment(double amount, String paymentMethod, String cardNumber, String expiryDate, String cvv) {
        super(amount, paymentMethod);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    @Override
    public void processPayment() {
        // Simulate card payment processing
        System.out.println("Processing card payment of $" + String.format("%.2f", getAmount()));
        System.out.println("Card ending in: " + cardNumber.substring(cardNumber.length() - 4));
        setSuccess(true);
        System.out.println("Card payment successful!");
    }
}