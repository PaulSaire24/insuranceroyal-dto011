package com.bbva.pisd.dto.insurance.commons;

import com.bbva.pisd.dto.insurance.commons.InsuranceFinancingDTO;

public class ValidityPeriodDTO extends InsuranceFinancingDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ValidityPeriodDTO{");
        sb.append("startDate='").append(this.getStartDate()).append('\'');
        sb.append(", endDate='").append(this.getEndDate()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
