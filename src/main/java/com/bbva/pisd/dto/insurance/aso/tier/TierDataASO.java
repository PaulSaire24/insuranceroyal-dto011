package com.bbva.pisd.dto.insurance.aso.tier;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

import java.util.List;

public class TierDataASO extends CommonFieldsASO {

    private String factorType;
    private Double chargeFactor;
    private String effectiveStartDate;
    private String effectiveEndDate;
    private List<TierSegmentASO> segments;

    public String getFactorType() { return factorType; }
    public void setFactorType(String factorType) { this.factorType = factorType; }
    public Double getChargeFactor() { return chargeFactor; }
    public void setChargeFactor(Double chargeFactor) { this.chargeFactor = chargeFactor; }
    public String getEffectiveStartDate() { return effectiveStartDate; }
    public void setEffectiveStartDate(String effectiveStartDate) { this.effectiveStartDate = effectiveStartDate; }
    public String getEffectiveEndDate() { return effectiveEndDate; }
    public void setEffectiveEndDate(String effectiveEndDate) { this.effectiveEndDate = effectiveEndDate; }
    public List<TierSegmentASO> getSegments() { return segments; }
    public void setSegments(List<TierSegmentASO> segments) { this.segments = segments; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TierDataASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append(", factorType='").append(factorType).append('\'');
        sb.append(", chargeFactor=").append(chargeFactor);
        sb.append(", effectiveStartDate='").append(effectiveStartDate).append('\'');
        sb.append(", effectiveEndDate='").append(effectiveEndDate).append('\'');
        sb.append(", segments=").append(segments);
        sb.append('}');
        return sb.toString();
    }

}
