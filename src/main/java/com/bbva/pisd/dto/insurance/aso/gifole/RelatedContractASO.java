package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class RelatedContractASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RelatedContractASO{");
        sb.append("number=").append(this.getNumber()).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
