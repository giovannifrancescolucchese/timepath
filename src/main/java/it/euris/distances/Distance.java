package it.euris.distances;

public class Distance {


    private double distance;
    private String udm;

    public Distance(double distance, String udm) {
        this.distance = distance;
        this.udm = udm;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getUdm() {
        return udm;
    }

    public void setUdm(String udm) {
        this.udm = udm;
    }
}

