// ================= FILE: Screen.java =================
import java.util.ArrayList;
import java.util.List;

public class Screen {

    // OOP Concept: Composition (Screen owns its Seats, created and managed internally)
    private int screenNumber;
    private List<Seat> seats;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public Screen(int screenNumber) {
        this.screenNumber = screenNumber;
        this.seats = new ArrayList<>();
    }

    public void createSeat(String number, String type) {
        this.seats.add(new Seat(number, type));
    }

    public List<Seat> getSeats() {
        return this.seats;
    }

    public int getScreenNumber() {
        return this.screenNumber;
    }
}