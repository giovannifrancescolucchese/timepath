package it.euris.service;

import it.euris.exception.DistanceConverterException;
import it.euris.logging.Logger;
import it.euris.logging.TimeStampLogger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

class TimePathCalculatorServiceTest {

    @Test
    @DisplayName("convert String 0h 0m 0s the return 0h 0m 0s and set the correct attributes")
    @ExtendWith(MockitoExtension.class)
    public void givenExecuteWhen500KMAnd50KMHThenReturn10h0m0s() throws DistanceConverterException {
        //arrange
        String distancetring="500 KM";
        String speedString="50 KMH";
        String expectedResult="10h 0m 0s";
        //mock del dummy
        final TimeStampLogger logger= Mockito.mock(TimeStampLogger.class);

    TimePathCalculatorService timePathCalculatorService =
        new TimePathCalculatorService(distancetring, speedString, logger);
        //act
        String result=timePathCalculatorService.execute();
        //assert
        assertEquals(expectedResult,result, "tempo di percorrenza calcolato correttamente");
    }

    //TODO: continuare con i test
//TEST DOUBLES DUMMY

    /*
    private class DummyLogger implements Logger {

        @Override
        public void append(String text) {

        }
    }
*/


}

