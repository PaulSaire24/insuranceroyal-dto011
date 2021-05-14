package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.VehiclePriceDTO;

public class PaymentAmountDTO extends VehiclePriceDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentAmountDTO{");
        sb.append("amount='").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
