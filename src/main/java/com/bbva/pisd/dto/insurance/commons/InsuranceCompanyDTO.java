package com.bbva.pisd.dto.insurance.commons;

public class InsuranceCompanyDTO extends CommonDTO {

    private String productId;

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceCompanyDTO");
        sb.append(super.toString());
        sb.append(", productId='").append(productId).append('\'');
        return sb.toString();
    }

}
