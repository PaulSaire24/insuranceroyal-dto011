package com.bbva.pisd.dto.insurance.policy;

import com.bbva.apx.dto.AbstractDTO;

public class DetailDTO extends AbstractDTO {

    private FactorDTO factor;
    private String priceType;

    public FactorDTO getFactor() { return factor; }
    public void setFactor(FactorDTO factor) { this.factor = factor; }
    public String getPriceType() { return priceType; }
    public void setPriceType(String priceType) { this.priceType = priceType; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DetailDTO{");
        sb.append("factor=").append(factor);
        sb.append(", priceType='").append(priceType).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
