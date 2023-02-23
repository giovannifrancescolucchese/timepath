package it.euris;

public class MilesPerHourToMetersPerSecond implements DistanceInterface {
    private static final double MILES_TO_METERS = 1609.344;
    @Override
    public double toMpS(double speed) {
        double converted = (speed * MILES_TO_METERS / 3600.0);
        return converted;
    }
}
