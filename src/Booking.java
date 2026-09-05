import java.util.List;

public class Booking {
    private String bookingId;
    private Customer customer;
    private Show show;
    private List<Seat> seats;
    private double totalAmount;
    private Payment payment;

    public Booking(String bookingId, Customer customer, Show show, List<Seat> seats, double totalAmount) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.show = show;
        this.seats = seats;
        this.totalAmount = totalAmount;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public boolean isPaid() {
        return payment != null;
    }
}