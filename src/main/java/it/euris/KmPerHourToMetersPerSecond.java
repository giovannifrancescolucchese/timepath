package it.euris;

public class KmPerHourToMetersPerSecond implements DistanceInterface {
    private static final double KM_TO_METERS = 1000.0;

    @Override
    public double toMpS(double speed) {
        double converted = (speed * KM_TO_METERS / 3600.0);
        return converted;
    }
}
