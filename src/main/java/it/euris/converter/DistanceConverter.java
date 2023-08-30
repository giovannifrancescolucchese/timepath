package it.euris.converter;

import it.euris.exception.DistanceConverterException;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DistanceConverter {
    //1Km=1000m, 1MM=1852m, 1MT=1609.344m

    Double kilometers;
    Double miles;
    Double nauticalMiles;

    public void setFromKilometers(Double kilometers) throws DistanceConverterException {
        if (kilometers>=0) {
            this.kilometers=kilometers;
            this.miles=this.convertKilometersToMiles(kilometers);
            this.nauticalMiles=this.convertKilometersToNauticalMiles(kilometers);
        }
        else throw new DistanceConverterException("non possono essere considerati valori negativi");
    }
    public void setFromMiles(Double miles) throws DistanceConverterException {
        if (miles>=0) {
            this.miles=miles;
            this.kilometers=this.convertMilesToKilometers(miles);
            this.nauticalMiles=this.convertMilesToNauticalMiles(miles);
        }
        else throw new DistanceConverterException("non possono essere considerati valori negativi");
    }
    public void setFromNauticalMiles(Double nauticalMiles) throws DistanceConverterException {
        if (nauticalMiles>=0) {
        this.nauticalMiles=nauticalMiles;
        this.kilometers=this.convertNauticalMilesToKilometers(nauticalMiles);
        this.miles=this.convertNauticalMilesToMiles(nauticalMiles);
        }
        else throw new DistanceConverterException("non possono essere considerati valori negativi");
    }


    private Double convertKilometersToMiles(Double kilometers) {
        return kilometers*1000d/1609.344;
    }
    private Double convertKilometersToNauticalMiles(Double kilometers) {
        return kilometers*1000d/1852d;
    }

    private Double convertMilesToKilometers(Double miles) {
        return miles*1609.344/1000d;
    }
    private Double convertMilesToNauticalMiles(Double miles) {
        return miles*1609.344/1852d;
    }

    private Double convertNauticalMilesToKilometers(Double nauticalMiles) {
        return nauticalMiles*1852d/1000d;
    }
    private Double convertNauticalMilesToMiles(Double nauticalMiles) {
        return nauticalMiles*1852d/1609.344;
    }


}
