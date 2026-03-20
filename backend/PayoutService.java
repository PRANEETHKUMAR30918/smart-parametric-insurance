public class PayoutService {

    public String processPayout(boolean isFraud, String riskLevel) {
        if (isFraud) {
            return "Payout blocked due to fraud risk";
        }

        if ("HIGH".equals(riskLevel)) {
            return "Payout initiated";
        }

        return "No payout required";
    }
}
