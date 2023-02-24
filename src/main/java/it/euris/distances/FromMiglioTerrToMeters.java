package it.euris.distances;

public class FromMiglioTerrToMeters implements ConverterInMeters {

    Distance distanceMeter;

    @Override
    public Distance ConverterDistance(Distance distance) {
        distanceMeter.setDistance(distance.getDistance() * 1609.344);
        distanceMeter.setUdm("m");
        return distanceMeter;
    }
}
