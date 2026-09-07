// ================= FILE: PriceCalculator.java =================
import java.util.List;

public class PriceCalculator {

    // Single Responsibility: PriceCalculator ONLY calculates math.
    // It does not print anything and does not change seat status.
    public static double calculateTotal(List<ShowSeat> seats) {
        double total = 0.0;
        for (ShowSeat showSeat : seats) {
            total += showSeat.getSeat().getPrice();
        }
        return total;
    }
}