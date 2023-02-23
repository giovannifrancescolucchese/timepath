package it.euris.converter;

import lombok.Data;

@Data
public class TimeConverter {
    private Double timeDouble;
    private String timeString;

    public String convertToString(Double timeDouble) {
        this.timeDouble = timeDouble;
        int hours=(int) timeDouble.doubleValue();
        int minutes=(int)((timeDouble-Double.valueOf(hours))*60);
        int seconds=(int) ((((timeDouble-Double.valueOf(hours))*60)-Double.valueOf(minutes))*60);
        this.timeString=String.format("%dh %dm %ds", hours, minutes, seconds);
        return this.timeString;
    }

    public Double convertToDouble(String timeString) {
        this.timeString=timeString;
        String[] hoursArray=timeString.split("h");
        String[] minutesArray=hoursArray[1].split("m");
        String[] secondsArray=minutesArray[1].split("s");

        Double hours=Double.parseDouble(hoursArray[0].trim());
        Double minutes=Double.parseDouble(minutesArray[0].trim())/60d;
        Double seconds=Double.parseDouble(secondsArray[0].trim())/3600d;

        this.timeDouble =hours+minutes+seconds;
        return this.timeDouble;
    }




}
