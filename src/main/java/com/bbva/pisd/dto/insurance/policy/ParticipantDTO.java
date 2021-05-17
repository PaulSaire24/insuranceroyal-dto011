package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.HolderDTO;

import java.util.Date;

public class ParticipantDTO extends HolderDTO {

    private ParticipantTypeDTO participantType;
    private String customerId;
    private Date startDate;
    private Date endDate;
    private RelationshipDTO relationship;
    private Double benefitPercentage;
    private BenefitAmountDTO benefitAmount;

    public ParticipantTypeDTO getParticipantType() { return participantType; }
    public void setParticipantType(ParticipantTypeDTO participantType) { this.participantType = participantType; }
    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }
    public RelationshipDTO getRelationship() { return relationship; }
    public void setRelationship(RelationshipDTO relationship) { this.relationship = relationship; }
    public Double getBenefitPercentage() { return benefitPercentage; }
    public void setBenefitPercentage(Double benefitPercentage) { this.benefitPercentage = benefitPercentage; }
    public BenefitAmountDTO getBenefitAmount() { return benefitAmount; }
    public void setBenefitAmount(BenefitAmountDTO benefitAmount) { this.benefitAmount = benefitAmount; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParticipantDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", fullName='").append(this.getFullName()).append('\'');
        sb.append(", identityDocument=").append(this.getIdentityDocument());
        sb.append(", participantType=").append(participantType);
        sb.append(", customerId='").append(customerId).append('\'');
        sb.append(", startDate='").append(startDate).append('\'');
        sb.append(", endDate='").append(endDate).append('\'');
        sb.append(", relationship=").append(relationship);
        sb.append(", benefitPercentage='").append(benefitPercentage).append('\'');
        sb.append(", benefitAmount=").append(benefitAmount);
        sb.append('}');
        return sb.toString();
    }

}
