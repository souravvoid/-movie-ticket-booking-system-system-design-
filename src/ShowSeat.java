// ================= FILE: ShowSeat.java =================
public class ShowSeat {

    // OOP Concept: Aggregation (ShowSeat references a Seat passed from outside)
    private static final String STATUS_AVAILABLE = "AVAILABLE";
    private static final String STATUS_BOOKED = "BOOKED";

    private Seat seat;
    private String status;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public ShowSeat(Seat seat) {
        this.seat = seat;
        this.status = STATUS_AVAILABLE;
    }

    public Seat getSeat() {
        return this.seat;
    }

    public boolean isAvailable() {
        return STATUS_AVAILABLE.equals(this.status);
    }

    public void markAsBooked() {
        this.status = STATUS_BOOKED;
    }

    public void releaseSeat() {
        this.status = STATUS_AVAILABLE;
    }

    public String getStatus() {
        return this.status;
    }
}