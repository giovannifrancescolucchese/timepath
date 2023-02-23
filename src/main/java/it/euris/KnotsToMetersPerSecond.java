package it.euris;

public class KnotsToMetersPerSecond implements DistanceInterface {

    private static final double NAUTICAL_MILES_TO_METERS = 1852.0;
    @Override
    public double toMpS(double speed) {
        double converted = (speed * NAUTICAL_MILES_TO_METERS / 3600.0);
        return converted;
    }
}
