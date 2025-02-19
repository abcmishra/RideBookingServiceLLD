public interface RiderActions {
    void bookRide(String driverId);
    void cancelRide(String rideID);
    void rateRide(String rideID,int rating);

}
