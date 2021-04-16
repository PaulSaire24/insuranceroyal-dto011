package com.bbva.pisd.dto.insurance.commons;

public class BillAmountDTO extends VehiclePriceDTO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BillAmountDTO{");
        sb.append("amount='").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
