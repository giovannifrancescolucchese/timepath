package it.euris.time;

public class Time {
    private final int second;
    private final int minute;
    private final int hour;


    public Time(double second) {
        this.hour = (int) (second / 3600);
        this.minute = (int) ((second % 3600) / 60);
        this.second = (int) second % 60;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }


    public int getSecond() {
        return second;
    }


    public String showTime() {
        return String.format("%d ore %d minuti e %d secondi", hour, minute, second);
    }
}
