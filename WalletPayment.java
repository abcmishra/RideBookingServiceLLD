public class WalletPayment implements PaymentStrategy{
    @Override
    public void pay(String rideId, double amount) {
        System.out.println("Paid ₹" + amount + " for Ride " + rideId + " using Wallet.");
    }
}
