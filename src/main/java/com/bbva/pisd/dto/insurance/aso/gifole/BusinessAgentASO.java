package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class BusinessAgentASO extends CommonFieldsASO{
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BusinessAgentASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}