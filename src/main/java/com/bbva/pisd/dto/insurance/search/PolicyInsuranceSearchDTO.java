package com.bbva.pisd.dto.insurance.search;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class PolicyInsuranceSearchDTO extends CommonOutputFieldsDTO {

    private ProductTypeDTO productType;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyInsuranceSearch{");
        sb.append("insuranceCompany=").append(this.getInsuranceCompany());
        sb.append(", productType=").append(productType);
        sb.append(", holder=").append(this.getHolder());
        sb.append(", inspection=").append(this.getInspection());
        sb.append(", externalPolicyNumber='").append(this.getExternalPolicyNumber()).append('\'');
        sb.append(", quotationId='").append(this.getQuotationId()).append('\'');
        sb.append(", productId='").append(this.getProductId()).append('\'');
        sb.append('}');
        return sb.toString();
    }




}
