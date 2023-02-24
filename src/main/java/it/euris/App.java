package it.euris;

import it.euris.exception.SpeedDistanceMinusZeroException;
import it.euris.time.Speed;
import it.euris.time.Time;
import it.euris.time.TimeCalculator;
import it.euris.time.TypeOfSpeed;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        TimeCalculator calculator = TimeCalculator.getInstance();
        Time time = null;
        try {
            time = calculator.calcuteTime(-6, new Speed(23, TypeOfSpeed.NODE));
            System.out.println(time.showTime());
        } catch (SpeedDistanceMinusZeroException e) {
            System.out.println(e.getMessage());
        }





    }
}
