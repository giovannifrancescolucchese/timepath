package it.euris.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampLogger /*implements Logger*/{
    //@Override
    public void append(String text) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        //just to test the legacy to the component ... int i=5/0;
        LocalDateTime now = LocalDateTime.now();
        System.out.println(text+ " "+dtf.format(now));
    }
}
