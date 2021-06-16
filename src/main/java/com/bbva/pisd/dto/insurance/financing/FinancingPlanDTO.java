package com.bbva.pisd.dto.insurance.financing;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.pisd.dto.insurance.commons.InstallmentsDTO;

import java.time.LocalDate;
import java.util.List;

public class FinancingPlanDTO extends AbstractDTO {

    private String quotationId;

    private LocalDate startDate;
    private LocalDate maturityDate;
    private String creationUser;
    private String userAudit;
    private String saleChannelId;
    private String traceId;
    private String aap;
    private List<InstallmentsDTO> installmentPlans;


    public String getQuotationId() { return quotationId; }
    public void setQuotationId(String quotationId) { this.quotationId = quotationId; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public LocalDate getMaturityDate() { return maturityDate; }
    public void setMaturityDate(LocalDate maturityDate) { this.maturityDate = maturityDate; }
    public List<InstallmentsDTO> getInstallmentPlans() { return installmentPlans; }
    public void setInstallmentPlans(List<InstallmentsDTO> installmentPlans) { this.installmentPlans = installmentPlans; }
    public String getCreationUser() { return creationUser; }
    public void setCreationUser(String creationUser) { this.creationUser = creationUser; }
    public String getUserAudit() { return userAudit; }
    public void setUserAudit(String userAudit) { this.userAudit = userAudit; }
    public String getSaleChannelId() { return saleChannelId; }
    public void setSaleChannelId(String saleChannelId) { this.saleChannelId = saleChannelId; }
    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }
    public String getAap() { return aap; }
    public void setAap(String aap) { this.aap = aap; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinancingPlanDTO{");
        sb.append("quotationId='").append(quotationId).append('\'');
        sb.append("startDate='").append(startDate).append('\'');
        sb.append("maturityDate='").append(maturityDate).append('\'');
        sb.append("installmentPlans='").append(this.installmentPlans).append('\'');
        sb.append('}');
        return sb.toString();
    }
}