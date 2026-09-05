public class TicketPrinter {

    public void printTicket(Booking booking) {
        System.out.println("========================================");
        System.out.println("       MOVIE TICKET");
        System.out.println("========================================");
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("Customer: " + booking.getCustomer().getName());
        System.out.println("Customer ID: " + booking.getCustomer().getCustomerId());
        System.out.println("Movie: " + booking.getShow().getMovie().getTitle());
        System.out.println("Language: " + booking.getShow().getMovie().getLanguage());
        System.out.println("Duration: " + booking.getShow().getMovie().getDurationInMinutes() + " mins");
        System.out.println("Show Time: " + booking.getShow().getShowTime());
        System.out.println("Screen: " + booking.getShow().getScreen().getScreenNumber());
        System.out.println("========================================");
        System.out.println("Seats:");
        for (Seat seat : booking.getSeats()) {
            System.out.println(" - " + seat.getSeatNumber() + " (" + seat.getSeatType() + ") - $" + String.format("%.2f", seat.getPrice()));
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Amount: $" + String.format("%.2f", booking.getTotalAmount()));
        System.out.println("Payment Method: " + booking.getPayment().getPaymentMethod());
        System.out.println("Payment Status: " + (booking.getPayment().isSuccess() ? "Success" : "Failed"));
        System.out.println("========================================");
        System.out.println("Thank you for booking! Enjoy the movie!");
        System.out.println("========================================");
    }
}