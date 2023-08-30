package a;

import ENUM.Speeds;
import ENUM.Units;

public class Main {
    public static void main(String[] args) {
        TimeCalculator time = new TimeCalculator(500, Units.Kilometers, 23, Speeds.Knots);
        System.out.print(time.toString());
        TimeCalculator time1 = new TimeCalculator(100, Units.Kilometers, 1, Speeds.Knots);
        System.out.print(time1.toString());
        TimeCalculator time2 = new TimeCalculator(100, Units.Kilometers, 1, Speeds.KilometersPerHour);
        System.out.print(time2.toString());
    }
}