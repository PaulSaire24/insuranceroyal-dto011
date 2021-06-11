package com.bbva.pisd.dto.insurance.financing;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.InstallmentsDTO;

import java.util.List;

public class FinancingPlanDTO extends CommonOutputFieldsDTO {

    private List<InstallmentsDTO> installmentsPlans;
    private List<InstallmentsDTO> installmentPlans;

    public List<InstallmentsDTO> getInstallmentPlans() { return installmentPlans; }
    public void setInstallmentPlans(List<InstallmentsDTO> installmentPlans) { this.installmentPlans = installmentPlans; }

    public List<InstallmentsDTO> getInstallmentsPlans() { return installmentsPlans; }
    public void setInstallmentsPlans(List<InstallmentsDTO> installmentsPlans) { this.installmentsPlans = installmentsPlans; }

    public String toString() {
        final StringBuilder sb = new StringBuilder("FinancingPlanDTO{");
        sb.append("quotationId='").append(this.getQuotationId()).append('\'');
        sb.append("startDate='").append(this.getStartDate()).append('\'');
        sb.append("maturityDate='").append(this.getMaturityDate()).append('\'');
        sb.append("installmentsPlans='").append(getInstallmentsPlans()).append('\'');
        sb.append("installmentPlans='").append(getInstallmentPlans()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
