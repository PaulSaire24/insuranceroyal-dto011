package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class PolicyInstallmentPlanDTO extends CommonOutputFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyInstallmentPlanDTO{");
        sb.append("startDate='").append(this.getStartDate()).append('\'');
        sb.append(", maturityDate='").append(this.getMaturityDate()).append('\'');
        sb.append(", totalNumberInstallments='").append(this.getTotalNumberInstallments()).append('\'');
        sb.append(", period=").append(this.getPeriod());
        sb.append(", paymentAmount=").append(this.getPaymentAmount());
        sb.append('}');
        return sb.toString();
    }

}
