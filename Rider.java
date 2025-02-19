class Rider implements RiderActions {
    private final String riderId;

    public Rider(String riderId) {
        this.riderId = riderId;
    }

    @Override
    public void cancelRide(String rideId) {
        Ride ride = RideService.getRide(rideId);

        if (ride == null) {
            System.out.println("Ride not found: " + rideId);
            return;
        }

        if (ride.getStatus() == RideStatus.REQUESTED || ride.getStatus() == RideStatus.ACCEPTED) {
            ride.cancel();
            System.out.println("Ride " + rideId + " has been successfully canceled.");
        } else {
            System.out.println("Cannot cancel ride in status: " + ride.getStatus());
        }
    }

    @Override
    public void bookRide(String driverId) {
        Ride ride = new RideBooking(riderId, driverId);
        RideService.addRide(ride);
        System.out.println("Ride booked with ID: " + ride.getRideId());
    }

    @Override
    public void rateRide(String rideId, int rating) {
        System.out.println("Ride " + rideId + " rated with " + rating + " stars.");
    }
}