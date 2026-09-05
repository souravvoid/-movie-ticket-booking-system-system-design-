import java.util.List;

public class Show {
    private String showId;
    private Movie movie;
    private Screen screen;
    private String showTime;
    private List<Seat> availableSeats;

    public Show(Movie movie, Screen screen, String showTime) {
        this.movie = movie;
        this.screen = screen;
        this.showTime = showTime;
        this.availableSeats = screen.getSeats();
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getShowTime() {
        return showTime;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }
}