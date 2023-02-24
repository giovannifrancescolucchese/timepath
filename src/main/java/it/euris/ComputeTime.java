package it.euris;

import it.euris.distances.Distance;

public class ComputeTime {

    private Time time;
    private Distance distance;
    private Velocity velocity;

    public ComputeTime(Distance distance, Velocity velocity){
        this.distance = distance;
        this.velocity = velocity;
    }

    public Time computeTime(Distance distance, Velocity velocity){
        double time = distance/velocity;
        return  new Time(distance.getDistance()/velocity.getVelocity);

    }


}
