// ================= FILE: Show.java =================
import java.util.ArrayList;
import java.util.List;

public class Show {

    // OOP Concept: Aggregation (Show references a Movie passed via constructor)
    private Movie movie;
    // OOP Concept: Aggregation (Show references a Screen passed via constructor)
    private Screen screen;
    // OOP Concept: Composition (Show owns its ShowSeats, created internally)
    private List<ShowSeat> showSeats;
    private String showTime;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public Show(Movie movie, Screen screen, String showTime) {
        this.movie = movie;
        this.screen = screen;
        this.showTime = showTime;
        this.showSeats = new ArrayList<>();
        createShowSeatsFromScreen();
    }

    private void createShowSeatsFromScreen() {
        for (Seat seat : this.screen.getSeats()) {
            this.showSeats.add(new ShowSeat(seat));
        }
    }

    public Movie getMovie() {
        return this.movie;
    }

    public Screen getScreen() {
        return this.screen;
    }

    public List<ShowSeat> getShowSeats() {
        return this.showSeats;
    }

    public String getShowTime() {
        return this.showTime;
    }

    public void displaySeatLayout() {
        System.out.println("Seat layout for " + this.movie.getTitle() + " on Screen "
                + this.screen.getScreenNumber() + " at " + this.showTime);
        for (ShowSeat showSeat : this.showSeats) {
            Seat seat = showSeat.getSeat();
            System.out.println("  " + seat.getNumber() + " (" + seat.getType() + "): "
                    + showSeat.getStatus());
        }
    }
}