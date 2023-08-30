package it.euris.exception;

import lombok.Data;

@Data
public class ParsingException extends Exception{

    String detail;

    public ParsingException(String detail) {
        this.detail=detail;
    }
}
