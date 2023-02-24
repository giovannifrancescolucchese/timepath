package it.euris;

import it.euris.distances.ConverterInMeters;
import it.euris.distances.Distance;
import it.euris.distances.DistanceEnum;
import it.euris.distances.FromKmToMeters;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String spazio = "500 km";
        //String velocita = "50 km/h";


        String[] tokens = spazio.split(" ");
        //double distance = Double.parseDouble(tokens[0]);
        //double distanceInMeters;
        //String udm = tokens[1];
        Distance distance1 = new Distance(Double.parseDouble(tokens[0]), tokens[1]);


        DistanceEnum distanceEnum = DistanceEnum.valueOf(distance1.getUdm());
        switch (distanceEnum){
            case km:
                FromKmToMeters fromKmToMeters = new FromKmToMeters();
                fromKmToMeters.ConverterDistance(distance1);
                System.out.println(distance1.getDistance()+" "+distance1.getUdm());

        }




    }
}
