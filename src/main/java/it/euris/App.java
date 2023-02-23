package it.euris;

import it.euris.exception.DistanceConverterException;
import it.euris.service.TimePathCalculatorService;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws DistanceConverterException {
        Scanner in = new Scanner(System.in);
        System.out.println( "Inserire distanza in KM o in MM o in MT" );
        String distanza = in.nextLine();
        System.out.println( "Inserire la velocita media in KMH o in KN o in MIH");
        String velocita = in.nextLine();
        TimePathCalculatorService tpcService=new TimePathCalculatorService(distanza,velocita);
        System.out.println(String.format("ad una velocita' media di %s per percorrere %s ci vogliono %s", velocita, distanza, "risultato"));
        System.out.println(tpcService.execute());
    }
}
