package com.bbva.pisd.dto.insurance.aso.gifole;

import java.math.BigDecimal;

public class SurfaceASO {
    private BigDecimal value;
    private SurfaceTypeASO surfaceType;
    private MeasurementUnitASO measurementUnit;

    public BigDecimal getValue() {return value;}
    public void setValue(BigDecimal value) {this.value = value;}
    public SurfaceTypeASO getSurfaceType() {return surfaceType;}
    public void setSurfaceType(SurfaceTypeASO surfaceType) {this.surfaceType = surfaceType;}
    public MeasurementUnitASO getMeasurementUnit() {return measurementUnit;}
    public void setMeasurementUnit(MeasurementUnitASO measurementUnit) {this.measurementUnit = measurementUnit;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SurfaceASO{");
        sb.append("value='").append(value).append('\'');
        sb.append(", surfaceType='").append(surfaceType).append('\'');
        sb.append(", measurementUnit='").append(measurementUnit).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
