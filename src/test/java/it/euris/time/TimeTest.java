package it.euris.time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.TestCase.assertEquals;

class TimeTest {

    @ParameterizedTest(name = "Given {0} second in the constructor when convert then we have string {1}")
    @CsvSource({
            "123455, 34 ore 17 minuti e 35 secondi",
            "24789, 6 ore 53 minuti e 9 secondi",
            "7890, 2 ore 11 minuti e 30 secondi"
    })
    public void checkConversionTimeStartingSecondToHourMinuteAndSecondToString(double second, String resultTime) {
        Time t = new Time(second);
        Assertions.assertEquals(resultTime, t.showTime());
    }
}