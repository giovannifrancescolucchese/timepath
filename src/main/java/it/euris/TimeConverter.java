package it.euris;

public class TimeConverter {
    public static int travelledSeconds(double distance, double speed){
        int timeInSeconds = (int) (distance/speed);
        return timeInSeconds;
    }
    public static String TravelledTime(int timeInSeconds){
        //int timeInSeconds = (int) (distance/speed);
        int hours = (timeInSeconds/3600);
        int minutes = ((timeInSeconds%3600)/60);
        int seconds = (timeInSeconds%60);
        return String.format("%d hours, %d minutes and %d seconds", hours, minutes, seconds);
    }
}
