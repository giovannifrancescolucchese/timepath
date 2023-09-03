package it.euris.service;

import it.euris.exception.DistanceConverterException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class TimePathCalculatorServiceTest {

    @Test
    @DisplayName("convert String 0h 0m 0s the return 0h 0m 0s and set the correct attributes")
    @ExtendWith(MockitoExtension.class)
    public void givenExecuteWhen500KMAnd50KMHThenReturn10h0m0s() throws DistanceConverterException {
        //arrange
        String distancetring="500 KM";
        String speedString="50 KMH";
        String expectedResult="10h 0m 0s";
        TimePathCalculatorService timePathCalculatorService=new TimePathCalculatorService(distancetring, speedString);
        final ExecutionServiceImpl executionServiceMock=Mockito.mock(ExecutionServiceImpl.class);
        Mockito.when(executionServiceMock.getPercentage()).thenReturn(79);
        //act
        String result=timePathCalculatorService.execute(executionServiceMock);

        //assert
        verify(executionServiceMock).increment();
        assertEquals(expectedResult,result, "tempo di percorrenza calcolato correttamente");
    }

    //TODO: continuare con i test


    //TEST DOUBLES: Stub
    /*
    private class ExecutionServiceStub implements ExecutionService {

        @Override
        public Integer getPercentage() {
            //Random random=new Random();
            //return random.nextInt()%100;
            return 79;
        }
    }

     */
}