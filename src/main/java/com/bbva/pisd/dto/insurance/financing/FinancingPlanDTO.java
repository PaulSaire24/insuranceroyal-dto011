package com.bbva.pisd.dto.insurance.financing;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.InstallmentsDTO;

import java.util.List;

public class FinancingPlanDTO extends CommonOutputFieldsDTO {

    private Long totalNumberInstallments;
    private List<InstallmentsDTO> installmentPlans;

    public List<InstallmentsDTO> getInstallmentPlans() { return installmentPlans; }
    public void setInstallmentPlans(List<InstallmentsDTO> installmentsPlans) { this.installmentPlans = installmentsPlans; }
    public Long getTotalNumberInstallments() { return totalNumberInstallments; }
    public void setTotalNumberInstallments(Long totalNumberInstallments) { this.totalNumberInstallments = totalNumberInstallments; }

    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentPlanDTO{");
        sb.append("maturityDate='").append(this.getMaturityDate()).append('\'');
        sb.append("totalNumberInstallments='").append(getTotalNumberInstallments()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
