package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class ContractGifoleASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractGifoleASO{");
        sb.append("number='").append(this.getNumber()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
