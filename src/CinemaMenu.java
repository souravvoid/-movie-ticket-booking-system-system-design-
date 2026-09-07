// ================= FILE: CinemaMenu.java =================
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaMenu {

    // OOP Concept: Association (Customer interacts with BookingService through this menu)
    
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final BookingService BOOKING_SERVICE = new BookingService();
    private static final TicketPrinter TICKET_PRINTER = new TicketPrinter();

    private static Cinema cinema;
    private static Show show1;
    private static Show show2;
    private static Customer customer;
    private static final List<Booking> ACTIVE_BOOKINGS = new ArrayList<>();

    public static void main(String[] args) {
        setupMockData();
        runInteractiveMenu();
    }

    private static void setupMockData() {
        cinema = new Cinema("PVR Cinemas");
        Screen screen1 = cinema.createScreen(1);
        Screen screen2 = cinema.createScreen(2);
        createSeats(screen1, "A", 5, Seat.TYPE_GOLD);
        createSeats(screen1, "B", 5, Seat.TYPE_SILVER);
        createSeats(screen2, "A", 5, Seat.TYPE_PLATINUM);
        createSeats(screen2, "B", 5, Seat.TYPE_GOLD);
        Movie movie1 = new Movie("Interstellar", "English", 169);
        Movie movie2 = new Movie("RRR", "Telugu", 186);
        show1 = new Show(movie1, screen1, "2024-01-15 14:00");
        show2 = new Show(movie2, screen2, "2024-01-15 18:00");
        customer = new Customer("John Doe", "9876543210");
    }

    private static void createSeats(Screen screen, String row, int count, String type) {
        for (int i = 1; i <= count; i++) {
            screen.createSeat(row + i, type);
        }
    }

    private static void runInteractiveMenu() {
        System.out.println();
        System.out.println("========== MOVIE TICKET BOOKING SYSTEM - MAIN MENU ==========");
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("    1. List movies");
            System.out.println("    2. View seat layout of a show");
            System.out.println("    3. Book tickets");
            System.out.println("    4. Cancel a booking");
            System.out.println("    5. Exit");
            System.out.print("    Enter your choice: ");
            int choice = readMenuChoice(SCANNER);
            if (choice == 1) {
                listMovies();
            } else if (choice == 2) {
                viewSeatLayout();
            } else if (choice == 3) {
                bookTicketsInteractively();
            } else if (choice == 4) {
                cancelBookingInteractively();
            } else if (choice == 5) {
                exit = true;
                System.out.println("Thank you for using Movie Ticket Booking System. Goodbye!");
            } else {
                System.out.println("    INVALID CHOICE: Please select a number between 1 and 5.");
            }
        }
    }

    private static void listMovies() {
        System.out.println();
        System.out.println("    Available Movies:");
        System.out.println("    1. " + describeShow(show1));
        System.out.println("    2. " + describeShow(show2));
    }

    private static String describeShow(Show show) {
        Movie movie = show.getMovie();
        return movie.getTitle() + " (" + movie.getLanguage() + ", " + movie.getDurationInMinutes()
                + " mins) on Screen " + show.getScreen().getScreenNumber() + " at " + show.getShowTime();
    }

    private static void viewSeatLayout() {
        System.out.println();
        System.out.println("    1. " + describeShow(show1));
        System.out.println("    2. " + describeShow(show2));
        System.out.print("    Choose a show (1 or 2): ");
        int showChoice = readMenuChoice(SCANNER);
        boolean isFirstShow = (showChoice == 1);
        Show chosenShow = isFirstShow ? show1 : show2;
        chosenShow.displaySeatLayout();
    }

    private static void bookTicketsInteractively() {
        System.out.println();
        System.out.println("    Available shows:");
        System.out.println("    1. " + describeShow(show1));
        System.out.println("    2. " + describeShow(show2));
        System.out.print("    Choose a show (1 or 2): ");
        int showChoice = readMenuChoice(SCANNER);
        boolean isFirstShow = (showChoice == 1);
        Show chosenShow = isFirstShow ? show1 : show2;
        chosenShow.displaySeatLayout();
        System.out.print("    Enter seat numbers (comma separated, e.g. A1,B2): ");
        List<String> seatNumbers = splitSeatInput(SCANNER.nextLine());
        Payment payment = readPaymentMethod();
        Booking booking = BOOKING_SERVICE.bookTickets(customer, chosenShow, seatNumbers, payment);
        if (booking != null) {
            ACTIVE_BOOKINGS.add(booking);
            TICKET_PRINTER.printTicket(booking);
        }
    }

    private static Payment readPaymentMethod() {
        System.out.println("    Payment methods: 1. UPI  2. Card (simulated FAILURE)  3. Cash");
        System.out.print("    Choose payment method: ");
        int choice = readMenuChoice(SCANNER);
        if (choice == 1) {
            return new UpiPayment("john@upi", "GPay");
        }
        if (choice == 2) {
            return new CardPayment("1234567890123456", "12/28", "123");
        }
        return new CashPayment("Ram");
    }

    private static List<String> splitSeatInput(String input) {
        List<String> seatNumbers = new ArrayList<>();
        for (String part : input.trim().split(",")) {
            seatNumbers.add(part.trim());
        }
        return seatNumbers;
    }

    private static void cancelBookingInteractively() {
        if (ACTIVE_BOOKINGS.isEmpty()) {
            System.out.println("    No active bookings to cancel.");
            return;
        }
        System.out.println("    Active bookings:");
        for (int i = 0; i < ACTIVE_BOOKINGS.size(); i++) {
            Booking booking = ACTIVE_BOOKINGS.get(i);
            System.out.println("    " + (i + 1) + ". Booking ID " + booking.getBookingId()
                    + " - " + booking.getShow().getMovie().getTitle() + " - " + booking.getStatus());
        }
        System.out.print("    Choose a booking to cancel: ");
        int index = readMenuChoice(SCANNER) - 1;
        if (index < 0 || index >= ACTIVE_BOOKINGS.size()) {
            System.out.println("    INVALID SELECTION: No such booking.");
            return;
        }
        BOOKING_SERVICE.cancelBooking(ACTIVE_BOOKINGS.get(index));
    }

    private static int readMenuChoice(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.println("    INVALID INPUT: Please enter a number.");
            input.next();
        }
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
}