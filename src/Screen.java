import java.util.ArrayList;
import java.util.List;

public class Screen {
    private int screenNumber;
    private List<Seat> seats;

    public Screen(int screenNumber) {
        this.screenNumber = screenNumber;
        this.seats = new ArrayList<>();
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
}