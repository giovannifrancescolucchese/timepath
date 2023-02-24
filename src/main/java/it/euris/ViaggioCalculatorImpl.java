package it.euris;

public class ViaggioCalculatorImpl implements ViaggioCalculator {
    private final double KM_PER_MARINE_MILE = 1.852;
    private final double KM_PER_STATUTE_MILE = 1.609344;

    @Override
    public double calcolaTempoDiViaggio(double distanza, double velocita, String unitaDistanza, String unitaVelocita) {
        // Conversione delle unità di misura, se necessario
        if (unitaDistanza.equals("mi")) {
            distanza *= KM_PER_STATUTE_MILE;
        } if (unitaDistanza.equals("nodi")) {
            distanza *= KM_PER_MARINE_MILE;
            velocita *= KM_PER_MARINE_MILE;
            unitaVelocita = "km/h";
        }

        if (unitaVelocita.equals("nodi")) {
            velocita *= KM_PER_MARINE_MILE;
        }

        // Calcolo del tempo di viaggio
        double tempo = distanza / (velocita);

        // Conversione del tempo in ore, minuti e secondi
        int ore = (int) tempo;
        int minuti = (int) ((tempo - ore) * 60);
        int secondi = (int) ((((tempo - ore) * 60) - minuti) * 60);

        // Stampa del risultato
        System.out.printf("Tempo di viaggio: %d ore, %d minuti, %d secondi\n", ore, minuti, secondi);

        return tempo;
    }

}

