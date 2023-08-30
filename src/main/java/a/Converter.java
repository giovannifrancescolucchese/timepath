package a;

import ENUM.Speeds;
import ENUM.Units;

public class Converter {
    double thousandSeaMilesToKm = 1852;
    double thousandLandMilesToKm = 1609.344;
    public Converter(){}
    public double convertDistanceToKm(double convertedUnit, Units unit){
        switch (unit) {
            case SeaMile:
                convertedUnit = (convertedUnit) * thousandSeaMilesToKm/1000;
                break;
            case LandMile:
                convertedUnit = (convertedUnit) * thousandLandMilesToKm/1000;
                break;
        }
        return convertedUnit;
    }

    public double convertSpeedToKmH(double convertedUnit, Speeds unit){
        switch (unit) {
            case Knots:
                convertedUnit = (convertedUnit) * thousandSeaMilesToKm / 1000;
                break;
            case MilesPerHour:
                convertedUnit = (convertedUnit) * thousandLandMilesToKm / 1000;
                break;
        }
        return convertedUnit;
    }


}
