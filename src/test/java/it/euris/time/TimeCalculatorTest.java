package it.euris.time;

import it.euris.exception.SpeedDistanceMinusZeroException;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeCalculatorTest {

    @ParameterizedTest(name = "Given distance {0} and speed {1} type {2} " +
            "when calculate the time then we have {3} hour {4} minute {5} second")
    @MethodSource("timeCalculate")
    void checkTheCalculateTime(double distance, int value, TypeOfSpeed type, int hour, int minute, int second) throws SpeedDistanceMinusZeroException {
        TimeCalculator calculator = new TimeCalculator();
        Time t = calculator.calcuteTime(distance, new Speed(value, type));
        assertEquals(hour, t.getHour());
        assertEquals(minute, t.getMinute());
        assertEquals(second, t.getSecond());
    }


    private static Stream<Arguments> timeCalculate() {
        return Stream.of(
                Arguments.of(500, 23, TypeOfSpeed.NODE, 11, 44, 17),
                Arguments.of(1400, 80, TypeOfSpeed.KM, 17, 30, 0),
                Arguments.of(30, 15, TypeOfSpeed.LANDMILE, 1, 14, 34)
        );
    }


}