package it.euris.distances;

public class FromMiglioMarinoToMeters implements ConverterInMeters {

    private Distance distanceMeter;
    @Override
    public Distance ConverterDistance(Distance distance) {
        distanceMeter.setUdm("m");
        distanceMeter.setDistance(distance.getDistance() * 1852);
        return distanceMeter;

    }
}
