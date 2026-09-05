
public class Seat {
    private String seatNumber;
    private String seatType; 

    public Seat(String seatNumber, String seatType) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public String getSeatType() {
        return this.seatType;
    }

    private static final double SILVER_PRICE = 150.0;
    private static final double GOLD_PRICE = 250.0;
    private static final double PLATINUM_PRICE = 400.0;

    public double getPrice() {
        if (this.seatType.equals("SILVER")) {
            return SILVER_PRICE;
        }
        if (this.seatType.equals("GOLD")) {
            return GOLD_PRICE;
        }
        return PLATINUM_PRICE;
    }
}