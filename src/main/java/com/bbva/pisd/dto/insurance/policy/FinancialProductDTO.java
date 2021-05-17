package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class FinancialProductDTO extends CommonDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinancialProductDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
