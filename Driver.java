class Driver implements DriverActions {
    private final String driverId;

    public Driver(String driverId) {
        this.driverId = driverId;
    }

    @Override
    public void acceptRide(String rideId) {
        System.out.println("Driver " + driverId + " accepted ride: " + rideId);
    }

    @Override
    public void cancelRide(String rideId) {
        System.out.println("Driver " + driverId + " canceled ride: " + rideId);
    }

    @Override
    public void completeRide(String rideId) {
        System.out.println("Driver " + driverId + " completed ride: " + rideId);
    }
}