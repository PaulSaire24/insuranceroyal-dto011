package com.bbva.pisd.dto.insurance.dao;

import java.math.BigDecimal;

public class InsuranceQuotationModDAO extends CommonsDAO {

    private String saleChannelId;
    private BigDecimal paymentTermNumber;
    private String policyPaymentFrequencyType;
    private String financingStartDate;
    private String financingEndDate;
    private BigDecimal premiumAmount;
    private String premiumCurrencyId;
    private String saveQuotationIndType;

    public String getSaleChannelId() { return saleChannelId; }
    public void setSaleChannelId(String saleChannelId) { this.saleChannelId = saleChannelId; }
    public BigDecimal getPaymentTermNumber() { return paymentTermNumber; }
    public void setPaymentTermNumber(BigDecimal paymentTermNumber) { this.paymentTermNumber = paymentTermNumber; }
    public String getPolicyPaymentFrequencyType() { return policyPaymentFrequencyType; }
    public void setPolicyPaymentFrequencyType(String policyPaymentFrequencyType) { this.policyPaymentFrequencyType = policyPaymentFrequencyType; }
    public String getFinancingStartDate() { return financingStartDate; }
    public void setFinancingStartDate(String financingStartDate) { this.financingStartDate = financingStartDate; }
    public String getFinancingEndDate() { return financingEndDate; }
    public void setFinancingEndDate(String financingEndDate) { this.financingEndDate = financingEndDate; }
    public BigDecimal getPremiumAmount() { return premiumAmount; }
    public void setPremiumAmount(BigDecimal premiumAmount) { this.premiumAmount = premiumAmount; }
    public String getPremiumCurrencyId() { return premiumCurrencyId; }
    public void setPremiumCurrencyId(String premiumCurrencyId) { this.premiumCurrencyId = premiumCurrencyId; }
    public String getSaveQuotationIndType() { return saveQuotationIndType; }
    public void setSaveQuotationIndType(String saveQuotationIndType) { this.saveQuotationIndType = saveQuotationIndType; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceQuotationModDAO{");
        sb.append("policyQuotaInternalId='").append(this.getPolicyQuotaInternalId()).append('\'');
        sb.append(", insuranceProductId=").append(this.getInsuranceProductId());
        sb.append(", insuranceModalityType='").append(this.getInsuranceModalityType()).append('\'');
        sb.append(", saleChannelId='").append(saleChannelId).append('\'');
        sb.append(", paymentTermNumber=").append(paymentTermNumber);
        sb.append(", policyPaymentFrequencyType='").append(policyPaymentFrequencyType).append('\'');
        sb.append(", financingStartDate='").append(financingStartDate).append('\'');
        sb.append(", financingEndDate='").append(financingEndDate).append('\'');
        sb.append(", premiumAmount=").append(premiumAmount);
        sb.append(", premiumCurrencyId='").append(premiumCurrencyId).append('\'');
        sb.append(", saveQuotationIndType='").append(saveQuotationIndType).append('\'');
        sb.append(", creationUser='").append(this.getCreationUser()).append('\'');
        sb.append(", userAudit='").append(this.getUserAudit()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
