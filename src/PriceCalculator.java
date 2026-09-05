public class PriceCalculator {

    public double calculatePrice(String seatType) {
        switch (seatType) {
            case "PLATINUM":
                return 400.0;
            case "GOLD":
                return 250.0;
            case "SILVER":
                return 150.0;
            default:
                return 150.0;
        }
    }

    public double calculateDiscountedPrice(String seatType, double percentage) {
        double basePrice = calculatePrice(seatType);
        return basePrice * (1 - percentage / 100);
    }
}