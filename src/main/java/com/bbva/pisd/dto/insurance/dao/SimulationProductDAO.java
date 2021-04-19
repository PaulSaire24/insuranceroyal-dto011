package com.bbva.pisd.dto.insurance.dao;

import java.math.BigDecimal;

public class SimulationProductDAO extends CommonsDAO {

    private String campaignFactorType;
    private BigDecimal campaignOffer1Amount;
    private BigDecimal campaignFactorPer;
    private String saleChannelId;

    public SimulationProductDAO() {
        this.campaignOffer1Amount = new BigDecimal("0");
        this.campaignFactorPer = new BigDecimal("0");
    }

    public String getCampaignFactorType() { return campaignFactorType; }
    public void setCampaignFactorType(String campaignFactorType) { this.campaignFactorType = campaignFactorType; }
    public BigDecimal getCampaignOffer1Amount() { return campaignOffer1Amount; }
    public void setCampaignOffer1Amount(BigDecimal campaignOffer1Amount) { this.campaignOffer1Amount = campaignOffer1Amount; }
    public BigDecimal getCampaignFactorPer() { return campaignFactorPer; }
    public void setCampaignFactorPer(BigDecimal campaignFactorPer) { this.campaignFactorPer = campaignFactorPer; }
    public String getSaleChannelId() { return saleChannelId; }
    public void setSaleChannelId(String saleChannelId) { this.saleChannelId = saleChannelId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimulationProductDAO{");
        sb.append("insuranceSimulationId=").append(this.getInsuranceSimulationId());
        sb.append(", insuranceProductId=").append(this.getInsuranceProductId());
        sb.append(", campaignFactorType='").append(campaignFactorType).append('\'');
        sb.append(", campaignOffer1Amount=").append(campaignOffer1Amount);
        sb.append(", campaignFactorPer=").append(campaignFactorPer);
        sb.append(", saleChannelId='").append(saleChannelId).append('\'');
        sb.append(", creationUser='").append(this.getCreationUser()).append('\'');
        sb.append(", userAudit='").append(this.getUserAudit()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
