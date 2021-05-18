package com.bbva.pisd.dto.insurance.policy;

import com.bbva.apx.dto.AbstractDTO;

public class FactorDTO extends AbstractDTO {

    private Double value;

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FactorDTO{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }

}
