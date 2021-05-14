package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.VehiclePriceDTO;

public class InsuredAmountDTO extends VehiclePriceDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuredAmountDTO{");
        sb.append("amount='").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
