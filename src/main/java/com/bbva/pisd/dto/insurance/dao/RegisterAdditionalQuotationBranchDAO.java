package com.bbva.pisd.dto.insurance.dao;

public class RegisterAdditionalQuotationBranchDAO extends CommonsDAO{

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceQuotationDAO{");
        sb.append("policyQuotaInternalId='").append(this.getPolicyQuotaInternalId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
