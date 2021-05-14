package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class ParticipantTypeDTO extends CommonOutputFieldsDTO {

    private RelationshipDTO relationship;
    private Double benefitPercentage;
    private BenefitAmountDTO benefitAmount;

    public RelationshipDTO getRelationship() { return relationship; }
    public void setRelationship(RelationshipDTO relationship) { this.relationship = relationship; }
    public Double getBenefitPercentage() { return benefitPercentage; }
    public void setBenefitPercentage(Double benefitPercentage) { this.benefitPercentage = benefitPercentage; }
    public BenefitAmountDTO getBenefitAmount() { return benefitAmount; }
    public void setBenefitAmount(BenefitAmountDTO benefitAmount) { this.benefitAmount = benefitAmount; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParticipantTypeDTO{");
        sb.append("relationship=").append(relationship);
        sb.append(", benefitPercentage=").append(benefitPercentage);
        sb.append(", benefitAmount=").append(benefitAmount);
        sb.append('}');
        return sb.toString();
    }

}
