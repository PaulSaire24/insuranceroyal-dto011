package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class InsuranceASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceASO{");
        sb.append("id=").append(this.getId());
        sb.append('}');
        return sb.toString();
    }
}
