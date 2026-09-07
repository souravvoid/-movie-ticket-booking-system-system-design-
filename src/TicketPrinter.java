// ================= FILE: TicketPrinter.java =================
import java.util.List;

public class TicketPrinter {

    // Single Responsibility: TicketPrinter ONLY formats strings and prints to console.
    // It does not calculate prices.
    public void printTicket(Booking booking) {
        System.out.println("========================================");
        System.out.println("              MOVIE TICKET             ");
        System.out.println("========================================");
        System.out.println("Booking ID  : " + booking.getBookingId());
        System.out.println("Status      : " + booking.getStatus());
        System.out.println("Customer    : " + booking.getCustomer().getName());
        System.out.println("Phone       : " + booking.getCustomer().getPhone());
        System.out.println("----------------------------------------");
        System.out.println("Movie       : " + booking.getShow().getMovie().getTitle());
        System.out.println("Language    : " + booking.getShow().getMovie().getLanguage());
        System.out.println("Duration    : " + booking.getShow().getMovie().getDurationInMinutes() + " mins");
        System.out.println("Screen      : " + booking.getShow().getScreen().getScreenNumber());
        System.out.println("Show Time   : " + booking.getShow().getShowTime());
        System.out.println("----------------------------------------");
        System.out.println("Seats       :");
        List<ShowSeat> seats = booking.getSeats();
        for (ShowSeat showSeat : seats) {
            System.out.println("              " + showSeat.getSeat().getNumber()
                    + " (" + showSeat.getSeat().getType() + ") - Rs."
                    + String.format("%.2f", showSeat.getSeat().getPrice()));
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Amount: Rs." + String.format("%.2f", booking.getTotalAmount()));
        System.out.println("========================================");
        System.out.println("Thank you for booking! Enjoy the movie!");
        System.out.println("========================================");
    }
}