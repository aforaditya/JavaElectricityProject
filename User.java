public class User {
    // Existing code

    public void payBill(PaymentMethod paymentMethod) {
        // Code to handle bill payment
        double billAmount = BillingService.getInstance().calculateBill(100); // Replace with actual units consumed
        // Implement payment logic using the provided payment method
        Logger.getInstance().log("Payment successful. Amount: " + billAmount);
    }
}