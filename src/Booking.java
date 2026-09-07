// ================= FILE: Booking.java =================
import java.util.List;

public class Booking {

    // OOP Concept: Static Members (shared counter generates unique booking IDs)
    private static final String STATUS_CONFIRMED = "CONFIRMED";
    private static final String STATUS_CANCELLED = "CANCELLED";

    private static int nextBookingId = 1001;

    private int bookingId;
    private Show show;
    private Customer customer;
    // OOP Concept: Aggregation (Booking references ShowSeats passed via constructor)
    private List<ShowSeat> seats;
    private double totalAmount;
    private String status;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public Booking(Show show, Customer customer, List<ShowSeat> seats, double totalAmount) {
        this.bookingId = nextBookingId++;
        this.show = show;
        this.customer = customer;
        this.seats = seats;
        this.totalAmount = totalAmount;
        this.status = STATUS_CONFIRMED;
    }

    public void cancel() {
        this.status = STATUS_CANCELLED;
    }

    public int getBookingId() {
        return this.bookingId;
    }

    public Show getShow() {
        return this.show;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public List<ShowSeat> getSeats() {
        return this.seats;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public String getStatus() {
        return this.status;
    }
}