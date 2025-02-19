public class RideBookingApp {
    public static void main(String[] args) {
        // Create Rider and Driver
        Rider rider = new Rider("R123");
        Driver driver = new Driver("D456");

        // Rider books a ride
        rider.bookRide("D456");

        // Fetch the ride details (Assuming only one ride for simplicity)
        Ride ride = RideService.getRideByRiderId("R123");

        if (ride != null) {
            // Driver accepts the ride
            driver.acceptRide(ride.getRideId());

            // Rider cancels the ride
            rider.cancelRide(ride.getRideId());

            // Driver tries to complete a canceled ride (shouldn't work)
            driver.completeRide(ride.getRideId());
        } else {
            System.out.println("No ride found for Rider.");
        }
    }
}
