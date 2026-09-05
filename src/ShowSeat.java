public class ShowSeat {
    
    private Seat seat;
    private String status;

    public ShowSeat(Seat seat) {
        this.seat = seat;
        this.status = "AVAILABLE";
    }

    public boolean isAvailable() {
        return this.status.equals("AVAILABLE");
    }

    public void markAsBooked() {
        if (this.isAvailable()) {
            this.status = "BOOKED";
        }
    }

    public void releaseSeat() {
        this.status = "AVAILABLE";
    }

    public String getSeatNumber() {
        return this.seat.getSeatNumber();
    }

    public double getPrice() {
        return this.seat.getPrice();
    }
}