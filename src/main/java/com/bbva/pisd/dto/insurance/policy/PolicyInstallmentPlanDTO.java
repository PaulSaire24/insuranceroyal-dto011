package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.PaymentPeriodDTO;

public class PolicyInstallmentPlanDTO extends CommonOutputFieldsDTO {

    private Long totalNumberInstallments;
    private PaymentPeriodDTO period;

    public Long getTotalNumberInstallments() { return totalNumberInstallments; }
    public void setTotalNumberInstallments(Long totalNumberInstallments) { this.totalNumberInstallments = totalNumberInstallments; }
    public PaymentPeriodDTO getPeriod() { return period; }
    public void setPeriod(PaymentPeriodDTO period) { this.period = period; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyInstallmentPlanDTO{");
        sb.append("startDate='").append(this.getStartDate()).append('\'');
        sb.append(", maturityDate='").append(this.getMaturityDate()).append('\'');
        sb.append(", totalNumberInstallments='").append(totalNumberInstallments).append('\'');
        sb.append(", period=").append(period);
        sb.append(", paymentAmount=").append(this.getPaymentAmount());
        sb.append('}');
        return sb.toString();
    }

}
