package it.euris.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampLogger implements Logger{
    @Override
    public void append(String text) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(text+ " "+dtf.format(now));
    }
}
