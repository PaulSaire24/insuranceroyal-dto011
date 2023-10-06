package com.bbva.pisd.dto.insurance.simulation;

import com.bbva.pisd.dto.insurance.aso.gifole.PeriodASO;
import com.bbva.pisd.dto.insurance.commons.VehiclePriceDTO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalAmountDTO implements Serializable {
    private static final long serialVersionUID = 445021072480734189L;
    private BigDecimal amount;
    private String currency;
    private PeriodASO period;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public PeriodASO getPeriod() {
        return period;
    }

    public void setPeriod(PeriodASO period) {
        this.period = period;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TotalAmountDTO{");
        sb.append("amount=").append(amount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", period=").append(period);
        sb.append('}');
        return sb.toString();
    }
}
