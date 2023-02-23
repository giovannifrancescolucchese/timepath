package it.euris.time;

public class TimeCalculator {
    private static TimeCalculator instance;

    public TimeCalculator() {
    }

    public static TimeCalculator getInstance() {
        if (instance == null) {
            instance = new TimeCalculator();
        }
        return instance;
    }

    public Time calcuteTime(double distance, Speed speed) {
        double second = 1;
        switch (speed.getType()) {
            case KM:
                second = (distance / speed.getValue()) * 3600;
                return new Time(second);
            case NODE:
                second = (distance / (speed.getValue() * 1.852)) * 3600;
                return new Time(second);
            case LANDMILE:
                second = (distance / (speed.getValue() * 1.609)) * 3600;
                return new Time(second);
            default:
                throw new RuntimeException();
        }
    }
}
