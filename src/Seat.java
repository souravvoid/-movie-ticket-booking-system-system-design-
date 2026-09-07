// ================= FILE: Seat.java =================
public class Seat {

    // OOP Concept: Encapsulation (fields are private, exposed via getters)
    private static final double SILVER_PRICE = 150.0;
    private static final double GOLD_PRICE = 250.0;
    private static final double PLATINUM_PRICE = 400.0;

    public static final String TYPE_SILVER = "SILVER";
    public static final String TYPE_GOLD = "GOLD";
    public static final String TYPE_PLATINUM = "PLATINUM";

    private String number;
    private String type;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public Seat(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        if (TYPE_GOLD.equals(this.type)) {
            return GOLD_PRICE;
        }
        if (TYPE_PLATINUM.equals(this.type)) {
            return PLATINUM_PRICE;
        }
        return SILVER_PRICE;
    }
}