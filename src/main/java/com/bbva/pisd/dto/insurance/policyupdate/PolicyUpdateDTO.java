package com.bbva.pisd.dto.insurance.policyupdate;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.InsuranceCompanyDTO;
import com.bbva.pisd.dto.insurance.commons.LinkDTO;
import com.bbva.pisd.dto.insurance.commons.ValidityPeriodDTO;

import java.util.StringJoiner;

public class PolicyUpdateDTO extends CommonOutputFieldsDTO {

    private InstallmentPlanDTO installmentPlan;
    private InsuranceCompanyDTO insuranceCompany;
    private ValidityPeriodDTO validityPeriod;

    private String insuranceId;
    private String externalPolicyNumber;



    public InstallmentPlanDTO getInstallmentPlan() { return installmentPlan; }
    public void setInstallmentPlan(InstallmentPlanDTO installmentPlan) { this.installmentPlan = installmentPlan; }
    public InsuranceCompanyDTO getInsuranceCompany() { return insuranceCompany; }
    public void setInsuranceCompany(InsuranceCompanyDTO insuranceCompany) { this.insuranceCompany = insuranceCompany; }
    public ValidityPeriodDTO getValidityPeriod() { return validityPeriod; }
    public void setValidityPeriod(ValidityPeriodDTO validityPeriod) { this.validityPeriod = validityPeriod; }
    public String getInsuranceId() { return insuranceId; }
    public void setInsuranceId(String insuranceId) { this.insuranceId = insuranceId; }
    public String getExternalPolicyNumber() { return externalPolicyNumber; }
    public void setExternalPolicyNumber(String externalPolicyNumber) { this.externalPolicyNumber = externalPolicyNumber; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyUpdateDTO{");
        sb.append("installmentPlan=").append(installmentPlan);
        sb.append(", insuranceCompany=").append(insuranceCompany);
        sb.append(", validityPeriod=").append(validityPeriod);
        sb.append(", insuranceId='").append(insuranceId).append('\'');
        sb.append(", externalPolicyNumber='").append(externalPolicyNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
