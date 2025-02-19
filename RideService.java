import java.util.HashMap;
import java.util.Map;

class RideService {
    private static final Map<String, Ride> rides = new HashMap<>();

    public static Ride getRide(String rideId) {
        return rides.get(rideId);
    }

    public static void addRide(Ride ride) {
        rides.put(ride.getRideId(), ride);
    }

    public static Ride getRideByRiderId(String riderId) {
        return rides.values().stream()
                .filter(ride -> ride.riderId.equals(riderId))
                .findFirst()
                .orElse(null);
    }
}
