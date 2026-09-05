public class CinemaApp {
    public static void main(String[] args) {
        System.out.println("=== Movie Ticket Booking System ===\n");

        Cinema cinema = new Cinema("INOX Cinemas");

        Screen screen1 = new Screen(1);
        Screen screen2 = new Screen(2);

        cinema.addScreen(screen1);
        cinema.addScreen(screen2);

        Movie movie1 = new Movie("Avatar: The Way of Water", "English", 192);
        Movie movie2 = new Movie("Inception", "English", 148);

        for (int i = 0; i < 10; i++) {
            screen1.addSeat(new Seat("A" + (i + 1), "GOLD"));
            screen1.addSeat(new Seat("B" + (i + 1), "SILVER"));
        }

        for (int i = 0; i < 8; i++) {
            screen2.addSeat(new Seat("A" + (i + 1), "PLATINUM"));
            screen2.addSeat(new Seat("B" + (i + 1), "GOLD"));
        }

        Show show1 = new Show(movie1, screen1, "2024-01-15 14:00");
        Show show2 = new Show(movie2, screen2, "2024-01-15 18:00");

        screen1.addShow(show1);
        screen2.addShow(show2);

        Customer customer = new Customer("C001", "John Doe", "john@example.com", "9876543210");

        System.out.println("Cinema: " + cinema.getCinemaName());
        System.out.println("Screens: " + cinema.getScreens().size());

        for (Screen screen : cinema.getScreens()) {
            System.out.println("Screen " + screen.getScreenNumber() + ": " + screen.getSeats().size() + " seats");
        }

        System.out.println("\nMovies available:");
        movie1.displayDetails();
        movie2.displayDetails();

        System.out.println("\n=== System Initialized Successfully ===");
    }
}