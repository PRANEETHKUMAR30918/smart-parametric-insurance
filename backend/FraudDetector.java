public class FraudDetector {

    public boolean isFraud(double speed, boolean mockGps, boolean ipMismatch) {
        if (mockGps || speed > 120 || ipMismatch) {
            return true;
        }
        return false;
    }
}
