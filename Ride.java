import java.util.UUID;

abstract class Ride {
    protected final String rideId;
    protected RideStatus status;
    protected final String riderId;
    protected final String driverId;
    protected double fare;

    public Ride(String riderId, String driverId, double fare) {
        this.rideId = UUID.randomUUID().toString();
        this.status = RideStatus.REQUESTED;
        this.riderId = riderId;
        this.driverId = driverId;
        this.fare = fare;
    }

    public String getRideId() {
        return rideId;
    }

    public RideStatus getStatus() {
        return status;
    }

    public abstract void cancel();

    public void complete(PaymentStrategy paymentStrategy) {
        if (status == RideStatus.ONGOING) {
            paymentStrategy.pay(rideId, fare);
            status = RideStatus.COMPLETED;
            System.out.println("Ride " + rideId + " has been completed.");
        } else {
            System.out.println("Ride cannot be completed before it starts or if it's canceled.");
        }
    }
}
