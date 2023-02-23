package it.euris.exception;

import lombok.Data;

@Data
public class SpeedConverterException extends Exception{
    String detail;

    public SpeedConverterException(String detail) {
        this.detail=detail;
    }
}
