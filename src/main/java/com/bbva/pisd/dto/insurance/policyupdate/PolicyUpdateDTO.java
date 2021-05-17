package com.bbva.pisd.dto.insurance.policyupdate;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class PolicyUpdateDTO extends CommonOutputFieldsDTO {

    private InstallmentPlanDTO installmentPlan;
    private String insuranceId;

    public InstallmentPlanDTO getInstallmentPlan() { return installmentPlan; }
    public void setInstallmentPlan(InstallmentPlanDTO installmentPlan) { this.installmentPlan = installmentPlan; }
    public String getInsuranceId() { return insuranceId; }
    public void setInsuranceId(String insuranceId) { this.insuranceId = insuranceId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyUpdateDTO{");
        sb.append("installmentPlan=").append(installmentPlan);
        sb.append(", insuranceCompany=").append(this.getInsuranceCompany());
        sb.append(", validityPeriod=").append(this.getValidityPeriod());
        sb.append(", insuranceId='").append(insuranceId).append('\'');
        sb.append(", externalPolicyNumber='").append(this.getExternalPolicyNumber()).append('\'');
        sb.append(", links=").append(this.getLinks());
        sb.append('}');
        return sb.toString();
    }

}
