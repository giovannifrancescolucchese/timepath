package it.euris.converter;

import lombok.Data;

@Data
public class SpeedConverter {
    //1Kmh=1Kmh 1nodo=1.852Kmh   1mih=1.609344Kmh

    Double kilometersPerHour;
    Double knots;
    Double milesPerHour;

    public void setFromKilometersPerHour(Double kilometersPerHour) {
        this.kilometersPerHour=kilometersPerHour;
        this.milesPerHour=this.convertKilometersPerHourToMilesPerHour(kilometersPerHour);
        this.knots=this.convertKilometersPerHourToKnots(kilometersPerHour);
    }

    public void setFromKnots(Double knots) {
        this.knots=knots;
        this.kilometersPerHour=this.convertKnotsToKilometersPerHour(knots);
        this.milesPerHour=this.convertKnotsToMilesPerHour(knots);
    }

    public void setFromMilesPerHour(Double milesPerHour) {
        this.milesPerHour=milesPerHour;
        this.kilometersPerHour=this.convertMilesPerHourToKilometersPerHour(milesPerHour);
        this.knots=this.convertMilesPerHourToKnots(milesPerHour);
    }


    private Double convertKilometersPerHourToKnots(Double kilometersPerHour) {
        return kilometersPerHour/1.852;
    }
    private Double convertKilometersPerHourToMilesPerHour(Double kilometersPerHour) {
        return kilometersPerHour/1.609344;
    }

    private Double convertKnotsToKilometersPerHour(Double knots) {
        return knots*1.852;
    }
    private Double convertKnotsToMilesPerHour(Double knots) {
        return this.convertKnotsToKilometersPerHour(knots)/1.609344;
    }

    private Double convertMilesPerHourToKnots(Double milesPerHour) {
        return this.convertMilesPerHourToKilometersPerHour(milesPerHour)/1.852;
    }
    private Double convertMilesPerHourToKilometersPerHour(Double milesPerHour) {
        return milesPerHour*1.609344;
    }


}
