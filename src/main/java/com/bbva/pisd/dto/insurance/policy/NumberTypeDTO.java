package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.InsuranceProductDTO;

public class NumberTypeDTO extends InsuranceProductDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberTypeDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
