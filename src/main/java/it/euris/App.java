package it.euris;

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
        Time time = calculator.calcuteTime(500, new Speed(23, TypeOfSpeed.NODE));
        System.out.println(time.showTime());

        Time t = new Time(7890);
        System.out.println(t.showTime());

    }
}
