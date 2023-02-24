package it.euris.service;

import it.euris.converter.DistanceConverter;
import it.euris.converter.SpeedConverter;
import it.euris.converter.TimeConverter;
import it.euris.exception.DistanceConverterException;
import it.euris.logging.Logger;
import it.euris.logging.XLogger;
import lombok.Data;

@Data

public class TimePathCalculatorService {
    String distanceString;
    String speedString;

    DistanceConverter distanceConverter;
    SpeedConverter speedConverter;

    XLogger logger;

    public TimePathCalculatorService(String distanceString, String speedString, XLogger logger) {
        this.distanceString=distanceString;
        this.speedString=speedString;
        this.logger=logger;
    }

    public String execute() throws DistanceConverterException {
        //logger.append("inizio esezuzione Time Path Calculator Service at");
        DistanceConverter dc=new DistanceConverter();
        String[] distanceArray=distanceString.split(" ");
        String[] speedArray=speedString.split(" ");
        Double distance=Double.valueOf(distanceArray[0]);
        String distanceUM=distanceArray[1];
        Double speed=Double.valueOf(speedArray[0]);
        String speedUM=speedArray[1];

        distanceConverter=new DistanceConverter();
        speedConverter=new SpeedConverter();

        switch(distanceUM) {
            case "KM":
                distanceConverter.setFromKilometers(distance);
                break;
            case "MM":
                distanceConverter.setFromNauticalMiles(distance);
                break;
            case "MT":
                distanceConverter.setFromMiles(distance);
                break;
        }

        switch(speedUM) {
            case "KMH":
                speedConverter.setFromKilometersPerHour(speed);
                break;
            case "KN":
                speedConverter.setFromKnots(speed);
                break;
            case "MIH":
                speedConverter.setFromMilesPerHour(speed);
                break;
        }
        Double hours=distanceConverter.getKilometers()/speedConverter.getKilometersPerHour();
        TimeConverter timeConverter=new TimeConverter();
        //logger.append("fine esezuzione Time Path Calculator Service at");
        return timeConverter.convertToString(hours);
    }

}
