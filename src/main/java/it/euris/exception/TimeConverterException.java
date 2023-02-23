package it.euris.exception;

import lombok.Data;

@Data
public class TimeConverterException extends Exception{
    String detail;
}
