import java.util.ArrayList;
import java.util.List;

public class Screen {
    private int screenNumber;
    private List<Seat> seats;
    private List<Show> shows;

    public Screen(int screenNumber) {
        this.screenNumber = screenNumber;
        this.seats = new ArrayList<>();
        this.shows = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        this.seats.add(seat);
    }

    public List<Seat> getSeats() {
        return this.seats;
    }

    public int getScreenNumber() {
        return this.screenNumber;
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }

    public List<Show> getShows() {
        return this.shows;
    }
}