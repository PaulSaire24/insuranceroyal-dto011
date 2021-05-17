package com.bbva.pisd.dto.insurance.commons;

import java.util.List;

public class InsuranceFinancingDTO extends CommonOutputFieldsDTO {

    private Long paymentsTotalnumber;
    private List<InstallmentsDTO> installments;

    public InsuranceFinancingDTO() {
        this.setId("123");
    }

    public Long getPaymentsTotalnumber() { return paymentsTotalnumber; }
    public void setPaymentsTotalnumber(Long paymentsTotalnumber) { this.paymentsTotalnumber = paymentsTotalnumber; }
    public List<InstallmentsDTO> getInstallments() { return installments; }
    public void setInstallments(List<InstallmentsDTO> installments) { this.installments = installments; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceFinancingDTO{");
        sb.append("id=").append(this.getId());
        sb.append(", paymentsTotalnumber=").append(paymentsTotalnumber);
        sb.append(", startDate='").append(this.getStartDate()).append('\'');
        sb.append(", maturityDate='").append(this.getMaturityDate()).append('\'');
        sb.append(", installments=").append(installments);
        sb.append('}');
        return sb.toString();
    }
}