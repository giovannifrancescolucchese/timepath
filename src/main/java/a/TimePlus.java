package a;

public class TimePlus {
    public int hour;
    public int minute;
    public int second;

    public TimePlus(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static TimePlus of(int hour, int minute, int second) {
        return new TimePlus(hour, minute, second);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
