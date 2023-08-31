package it.euris.converter;

import it.euris.exception.DistanceConverterException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceConverterTest {

    DistanceConverter dc=new DistanceConverter();

    @BeforeEach
    void init() {
        dc=new DistanceConverter();
    }


    @ParameterizedTest(name="Given {0} Km Then return {1} nautical miles and {2} terrestral miles")
    @CsvSource({
            "0.0,  0.0, 0.0,",
            "1.0, 0.5399568034557235, 0.621371192237334",
            "1852, 1000, 1609,",
            Double.MAX_VALUE-1+ ", "+Double.POSITIVE_INFINITY,
            Double.MAX_VALUE+ ", "+Double.POSITIVE_INFINITY
    })
    void convertKilometersToNauticalMiles(Double kilometers, Double expectedResultMN, Double expectedResultM) throws DistanceConverterException {
        //arrange
        dc.setFromKilometers(kilometers);
        //act
        Double result=dc.getNauticalMiles();
        Double result2=dc.getMiles();
        //assert
        assertEquals(expectedResultMN, result, ()->String.format("%1$,.2f km  should equals to %2$,.2f nautical miles", kilometers,expectedResultMN));
        assertEquals(expectedResultM, result2, ()->String.format("%1$,.2f km  should equals to %2$,.2f nautical miles", kilometers,expectedResultM));

    }


    @ParameterizedTest(name="Given {0} Km Then return {1} miles ")
    @CsvSource({
            "0.0,  0.0",
            "1.609344, 1.0"
    })
    void convertKilometersToMiles(Double kilometers, Double expectedResult) throws DistanceConverterException {
        //arrange
        dc.setFromKilometers(kilometers);
        //act
        Double result=dc.getMiles();
        //assert
        assertEquals(expectedResult, result, ()->String.format("%1$,.2f km  should equals to %2$,.2f miles", kilometers,expectedResult));
    }



    //TODO: continuare con i test di conversione ....


}