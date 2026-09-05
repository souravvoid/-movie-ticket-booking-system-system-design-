public class ShowSeat {
    private Show show;
    private Seat seat;
    private boolean isBooked;

    public ShowSeat(Show show, Seat seat) {
        this.show = show;
        this.seat = seat;
        this.isBooked = false;
    }

    public Show getShow() {
        return show;
    }

    public Seat getSeat() {
        return seat;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}