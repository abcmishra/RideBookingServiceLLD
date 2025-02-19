public class RideBooking extends  Ride {

    public RideBooking(String riderId,String driverId){
        super(riderId,driverId);
    }

    @Override
    public void cancel() {
    if(status == RideStatus.ACCEPTED || status == RideStatus.REQUESTED || status == RideStatus.CANCELED){
        System.out.println("Ride " +rideID + "has been cancelled");
    } else {
        System.out.println("Ongoing rie can't be cancelled");
    }
    }

    @Override
    public void complete() {
        if (status == RideStatus.ONGOING) {
            status = RideStatus.COMPLETED;
            System.out.println("Ride " + rideID + " has been completed.");
        } else {
            System.out.println("Ride cannot be completed before it starts.");
        }
    }
}
