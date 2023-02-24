package it.euris;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        // Creazione dell'oggetto del calcolatore del tempo di viaggio
        ViaggioCalculator calculator = new ViaggioCalculatorImpl();

        // Lettura dell'input dall'utente
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la distanza da percorrere: ");
        double distanza = input.nextDouble();

        System.out.print("Inserisci la velocità media: ");
        double velocita = input.nextDouble();

        System.out.print("Inserisci l'unità di misura della distanza (km, mi, nm): ");
        String unitaDistanza = input.next();

        System.out.print("Inserisci l'unità di misura della velocità (km/h, mi/h, nodi): ");
        String unitaVelocita = input.next();

        // Calcolo del tempo di viaggio
        double tempo = calculator.calcolaTempoDiViaggio(distanza, velocita, unitaDistanza, unitaVelocita);

    }

    }

