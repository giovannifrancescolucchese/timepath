package it.euris.distances;

public class FromKmToMeters implements ConverterInMeters {

    Distance distanceMeter;

    @Override
    public Distance ConverterDistance(Distance distance) {
        distanceMeter.setUdm("m");
        distanceMeter.setDistance(distance.getDistance() * 1000);
        return distanceMeter;
    }


}
