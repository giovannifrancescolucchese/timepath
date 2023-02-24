package it.euris.time;

import it.euris.exception.SpeedDistanceMinusZeroException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {
    @Test
    public void throwExceptionWhenDistanceOrSpeedAreMinusToZero() {
        TimeCalculator calculator = new TimeCalculator();
        assertThrows(SpeedDistanceMinusZeroException.class, () -> calculator.calcuteTime(-24, new Speed(14, TypeOfSpeed.NODE)));
    }
}