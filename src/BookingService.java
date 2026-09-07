// ================= FILE: BookingService.java =================
import java.util.ArrayList;
import java.util.List;

public class BookingService {

    public Booking bookTickets(Customer customer, Show show, List<String> seatNumbers, Payment payment) {
        List<ShowSeat> requestedSeats = findShowSeats(show, seatNumbers);
        if (requestedSeats.isEmpty()) {
            System.out.println("BOOKING REJECTED: No matching seat numbers found.");
            return null;
        }
        if (!areAllAvailable(requestedSeats)) {
            System.out.println("BOOKING REJECTED: One or more seats are already booked.");
            return null;
        }
        double totalAmount = PriceCalculator.calculateTotal(requestedSeats);
        boolean isPaid = payment.pay(totalAmount);
        if (!isPaid) {
            System.out.println("BOOKING ABORTED: Payment failed. Seats were NOT marked as booked.");
            return null;
        }
        markAllAsBooked(requestedSeats);
        Booking booking = new Booking(show, customer, requestedSeats, totalAmount);
        System.out.println("BOOKING CONFIRMED: Booking ID " + booking.getBookingId());
        return booking;
    }

    // OOP Concept: Compile-Time Polymorphism (overloaded method - books one seat)
    public Booking bookTickets(Customer customer, Show show, String seatNumber, Payment payment) {
        List<String> singleSeat = new ArrayList<>();
        singleSeat.add(seatNumber);
        return bookTickets(customer, show, singleSeat, payment);
    }

    public void cancelBooking(Booking booking) {
        booking.cancel();
        for (ShowSeat showSeat : booking.getSeats()) {
            showSeat.releaseSeat();
        }
        System.out.println("BOOKING CANCELLED: Booking ID " + booking.getBookingId()
                + " cancelled. Seats released and marked as AVAILABLE again.");
    }

    private List<ShowSeat> findShowSeats(Show show, List<String> seatNumbers) {
        List<ShowSeat> matches = new ArrayList<>();
        for (String seatNumber : seatNumbers) {
            ShowSeat showSeat = findShowSeat(show, seatNumber);
            if (showSeat != null) {
                matches.add(showSeat);
            }
        }
        return matches;
    }

    private ShowSeat findShowSeat(Show show, String seatNumber) {
        for (ShowSeat showSeat : show.getShowSeats()) {
            if (showSeat.getSeat().getNumber().equals(seatNumber)) {
                return showSeat;
            }
        }
        return null;
    }

    private boolean areAllAvailable(List<ShowSeat> seats) {
        for (ShowSeat showSeat : seats) {
            if (!showSeat.isAvailable()) {
                return false;
            }
        }
        return true;
    }

    private void markAllAsBooked(List<ShowSeat> seats) {
        for (ShowSeat showSeat : seats) {
            showSeat.markAsBooked();
        }
    }
}