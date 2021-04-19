package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.commons.VehiclePriceDTO;

public class TotalGifoleASO extends VehiclePriceDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TotalGifoleASO{");
        sb.append("amount=").append(this.getAmount());
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
