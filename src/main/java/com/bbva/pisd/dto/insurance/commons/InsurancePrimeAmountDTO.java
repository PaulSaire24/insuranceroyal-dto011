package com.bbva.pisd.dto.insurance.commons;

public class InsurancePrimeAmountDTO extends VehiclePriceDTO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsurancePrimeAmountDTO{");
        sb.append("amount='").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}