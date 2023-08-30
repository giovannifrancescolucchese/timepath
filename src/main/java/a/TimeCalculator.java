package a;

import ENUM.Speeds;
import ENUM.Units;

public class TimeCalculator {

    private final Units unit;
    private final int distance;
    private final Speeds speed;
    private final int velocity;
    private final TimePlus time;

    public TimeCalculator(int distance, Units unit, int velocity, Speeds speeds) {
        this.unit = unit;
        this.distance = distance;
        this.speed = speeds;
        this.velocity = velocity;
        Converter converter = new Converter();
        double kmDistance = converter.convertDistanceToKm(distance, unit);
        double kmSpeed = converter.convertSpeedToKmH(velocity, speeds);
        time = TimePlus.of(getHours(kmDistance, kmSpeed),
                getMinutes(kmDistance, kmSpeed),getSeconds(kmDistance, kmSpeed));
    }

    private int getHours(double kmDistance, double kmSpeed) {
        return (int) (kmDistance / kmSpeed);
    }

    private int getMinutes(double kmDistance, double kmSpeed) {
        return (int) (((kmDistance % kmSpeed) / kmSpeed) * 60);
    }

    private int getSeconds(double kmDistance, double kmSpeed) {
        return (int) (((((kmDistance % kmSpeed) / kmSpeed) * 60) * 60) - (getMinutes(kmDistance, kmSpeed) * 60) );
    }

    @Override
    public String toString() {
        return  "Travelling " + distance + " " + unit.toString() +
                " at an average velocity of " + velocity + " "+ speed +
                " will take "  + time + "\n" ;
    }
}


