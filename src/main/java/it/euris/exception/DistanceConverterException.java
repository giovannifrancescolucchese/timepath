package it.euris.exception;

import lombok.Data;

@Data
public class DistanceConverterException extends Exception {
    String detail;

    public DistanceConverterException(String detail) {
        this.detail=detail;
    }
}
