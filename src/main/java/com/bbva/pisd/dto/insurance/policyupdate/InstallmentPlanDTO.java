package com.bbva.pisd.dto.insurance.policyupdate;

import com.bbva.pisd.dto.insurance.commons.InstallmentsDTO;

public class InstallmentPlanDTO extends InstallmentsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentPlanDTO{");
        sb.append("maturityDate='").append(this.getMaturityDate()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
