import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Show {
    
    private Movie movie;
    private Screen screen;
    private LocalTime startTime;
    
    
    private List<ShowSeat> showSeats;

    public Show(Movie movie, Screen screen, LocalTime startTime) {
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.showSeats = new ArrayList<>();
        
        
        for (Seat physicalSeat : screen.getSeats()) {
            this.showSeats.add(new ShowSeat(physicalSeat));
        }
    }

    public Movie getMovie() {
        return this.movie;
    }

    public Screen getScreen() {
        return this.screen;
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public List<ShowSeat> getShowSeats() {
        return this.showSeats;
    }

    public void displaySeatLayout() {
        System.out.println("\n--- Screen " + this.screen.getScreenNumber() + " | " + this.startTime + " ---");
        for (ShowSeat showSeat : this.showSeats) {
            String statusStr = showSeat.isAvailable() ? "AVAILABLE" : "BOOKED";
            // Clean Code: Max 2 levels of indentation, intention-revealing names
            System.out.printf("%-5s [₹%-4.0f] [%-9s]  ", 
                showSeat.getSeatNumber(), 
                showSeat.getPrice(), 
                statusStr);
        }
        System.out.println();
    }
}