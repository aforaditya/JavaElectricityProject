public class BillingService {
    private static final BillingService instance = new BillingService();

    private BillingService() {
        // Private constructor to enforce Singleton pattern
    }

    public static BillingService getInstance() {
        return instance;
    }

    public double calculateBill(int unitsConsumed) {
        // Placeholder calculation, replace with your actual logic
        return unitsConsumed * 0.1;
    }
}
