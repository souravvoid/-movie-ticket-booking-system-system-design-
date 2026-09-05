import java.util.List;

public class BookingService {

    public Booking bookTickets(Customer customer, Show show, List<Seat> selectedSeats, Payment payment) {
        double totalAmount = calculateTotalAmount(selectedSeats, show);

        Booking booking = new Booking(
            generateBookingId(),
            customer,
            show,
            selectedSeats,
            totalAmount
        );

        booking.setPayment(payment);

        return booking;
    }

    private double calculateTotalAmount(List<Seat> seats, Show show) {
        double total = 0.0;
        for (Seat seat : seats) {
            total += seat.getPrice();
        }
        return total;
    }

    private String generateBookingId() {
        return "BK-" + System.currentTimeMillis();
    }
}