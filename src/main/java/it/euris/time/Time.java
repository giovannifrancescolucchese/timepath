package it.euris.time;

public class Time {
    public int second;
    public int minute;
    public int hour;


    public Time(double second) {
        this.hour = (int) (second / 3600);
        this.minute = (int) ((second % 3600) / 60);
        this.second = (int) second % 60;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String showTime() {
        return String.format("%d ore, %d minuti e %d secondi", hour, minute, second);
    }
}
