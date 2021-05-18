package com.bbva.pisd.dto.insurance.commons;

public class InsuranceCompanyDTO extends CommonDTO {

    private String productId;
    private QuotationStatusDTO status;

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
    public QuotationStatusDTO getStatus() { return status; }
    public void setStatus(QuotationStatusDTO status) { this.status = status; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceCompanyDTO");
        sb.append(super.toString());
        sb.append(", productId='").append(productId).append('\'');
        sb.append(", status='").append(status);
        return sb.toString();
    }

}
