package it.euris.time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TimeTest {

    @ParameterizedTest(name = "Given {0} second in the constructor when convert then we have string {1}")
    @CsvSource({
            "0, 0 ore 0 minuti e 0 secondi",
            "1, 0 ore 0 minuti e 1 secondi",
            "7890, 2 ore 11 minuti e 30 secondi",
            Double.MAX_VALUE - 1 + ", 2147483647 ore 26 minuti e 7 secondi",
            Double.MAX_VALUE + ", 2147483647 ore 26 minuti e 7 secondi"
    })
    public void checkConversionTimeStartingSecondToHourMinuteAndSecondToString(double second, String resultTime) {
        Time t = new Time(second);
        Assertions.assertEquals(resultTime, t.showTime());
    }
}