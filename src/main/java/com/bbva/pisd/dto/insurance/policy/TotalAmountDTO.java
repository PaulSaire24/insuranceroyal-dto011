package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.aso.gifole.PeriodASO;
import com.bbva.pisd.dto.insurance.commons.VehiclePriceDTO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalAmountDTO extends VehiclePriceDTO {
    private PeriodASO period;

    public PeriodASO getPeriod() {
        return period;
    }

    public void setPeriod(PeriodASO period) {
        this.period = period;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TotalAmountDTO{");
        sb.append("amount='").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
