public class Admin {
    // Existing code

    public void calculateElectricityBill(User customer, int unitsConsumed) {
        // Code to calculate electricity bill
        double billAmount = BillingService.getInstance().calculateBill(unitsConsumed);
        Logger.getInstance().log("Bill calculated for " + customer.getUsername() + ". Amount: " + billAmount);
    }
}