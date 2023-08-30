package it.euris.service;

import it.euris.exception.DistanceConverterException;
import it.euris.logging.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimePathCalculatorServiceTest {

    @Test
    @DisplayName("convert String 0h 0m 0s the return 0h 0m 0s and set the correct attributes")
    public void givenExecuteWhen500KMAnd50KMHThenReturn10h0m0s() throws DistanceConverterException {
        //arrange
        String distancetring="500 KM";
        String speedString="50 KMH";
        String expectedResult="10h 0m 0s";
        TimePathCalculatorService timePathCalculatorService=new TimePathCalculatorService(distancetring, speedString, new DummyLogger());
        //act
        String result=timePathCalculatorService.execute();
        //assert
        assertEquals(expectedResult,result, "tempo di percorrenza calcolato correttamente");
    }

    //TODO: continuare con i test
//TEST DOUBLES DUMMY
    private class DummyLogger implements Logger {

        @Override
        public void append(String text) {

        }
    }



}

