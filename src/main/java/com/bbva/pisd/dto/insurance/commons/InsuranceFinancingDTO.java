package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

import java.util.Date;
import java.util.List;

public class InsuranceFinancingDTO extends AbstractDTO {

    private String id;
    private Long paymentsTotalnumber;
    private Date startDate;
    private Date maturityDate;
    private List<InstallmentsDTO> installments;

    public InsuranceFinancingDTO() {
        this.id = "123";
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Long getPaymentsTotalnumber() { return paymentsTotalnumber; }
    public void setPaymentsTotalnumber(Long paymentsTotalnumber) { this.paymentsTotalnumber = paymentsTotalnumber; }
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public Date getMaturityDate() { return maturityDate; }
    public void setMaturityDate(Date maturityDate) { this.maturityDate = maturityDate; }
    public List<InstallmentsDTO> getInstallments() { return installments; }
    public void setInstallments(List<InstallmentsDTO> installments) { this.installments = installments; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceFinancingDTO{");
        sb.append("id=").append(id);
        sb.append(", paymentsTotalnumber=").append(paymentsTotalnumber);
        sb.append(", startDate='").append(startDate).append('\'');
        sb.append(", maturityDate='").append(maturityDate).append('\'');
        sb.append(", installments=").append(installments);
        sb.append('}');
        return sb.toString();
    }
}