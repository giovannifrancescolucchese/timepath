package it.euris.converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeConverterTest   {

    TimeConverter timeConverter;

    @BeforeEach
    public void init() {
        timeConverter=new TimeConverter();
    }

    @Test
    @DisplayName("convert BigDecimal 0 the return 0h 0m 0s and set the correct attributes")
    public void givenConvertToStringWhen0ThenReturn0h0m0s() {
        //arrange
        Double time=0d;
        String expectedResult="0h 0m 0s";
        //act
        String result=timeConverter.convertToString(time);
        //assert
        assertNotNull(timeConverter.getTimeDouble());
        assertNotNull(timeConverter.getTimeString());
        assertEquals(result, expectedResult, "conversione in stringa avvenuta correttamente");
    }

    @Test
    @DisplayName("convert String 0h 0m 0s the return 0h 0m 0s and set the correct attributes")
    public void givenConvertToBigDecimalgWhen0h_0m_0sThenReturn0() {
        //arrange
        String timeString="0h 0m 0s";
        Double timeResult=0d;
        //act
        Double result=timeConverter.convertToDouble(timeString);
        //assert
        assertNotNull(timeConverter.getTimeDouble());
        assertNotNull(timeConverter.getTimeString());
        assertEquals(result, timeResult, "conversione in BigDecimal avvenuta correttamente");
    }


    //TODO: continuare con i test di conversione
}