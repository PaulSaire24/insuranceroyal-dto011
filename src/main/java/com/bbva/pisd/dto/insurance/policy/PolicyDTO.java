package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

import java.util.List;

public class PolicyDTO extends CommonOutputFieldsDTO {

    private PolicyProductPlan productPlan;
    private PolicyPaymentMethodDTO paymentMethod;
    private TotalAmountDTO totalAmount;
    private InsuredAmountDTO insuredAmount;
    private boolean isDataTreatment;
    private List<RelatedContractDTO> relatedContracts;
    private PolicyInstallmentPlanDTO installmentPlan;
    private boolean hasAcceptedContract;
    private PolicyInspectionDTO inspection;
    private FirstInstallmentDTO firstInstallment;
    private List<ParticipantDTO> participants;
    private BusinessAgentDTO businessAgent;
    private PromoterDTO promoter;

    private String policyNumber;
    private String productDescription;
    private String externalQuotationId;
    private String externalPolicyNumber;

    public PolicyProductPlan getProductPlan() { return productPlan; }
    public void setProductPlan(PolicyProductPlan productPlan) { this.productPlan = productPlan; }
    public PolicyPaymentMethodDTO getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(PolicyPaymentMethodDTO paymentMethod) { this.paymentMethod = paymentMethod; }
    public TotalAmountDTO getTotalAmount() { return totalAmount; }
    public void setTotalAmount(TotalAmountDTO totalAmount) { this.totalAmount = totalAmount; }
    public InsuredAmountDTO getInsuredAmount() { return insuredAmount; }
    public void setInsuredAmount(InsuredAmountDTO insuredAmount) { this.insuredAmount = insuredAmount; }
    public boolean isDataTreatment() { return isDataTreatment; }
    public void setDataTreatment(boolean dataTreatment) { isDataTreatment = dataTreatment; }
    public List<RelatedContractDTO> getRelatedContracts() { return relatedContracts; }
    public void setRelatedContracts(List<RelatedContractDTO> relatedContracts) { this.relatedContracts = relatedContracts; }
    public PolicyInstallmentPlanDTO getInstallmentPlan() { return installmentPlan; }
    public void setInstallmentPlan(PolicyInstallmentPlanDTO installmentPlan) { this.installmentPlan = installmentPlan; }
    public boolean isHasAcceptedContract() { return hasAcceptedContract; }
    public void setHasAcceptedContract(boolean hasAcceptedContract) { this.hasAcceptedContract = hasAcceptedContract; }
    public PolicyInspectionDTO getInspection() { return inspection; }
    public void setInspection(PolicyInspectionDTO inspection) { this.inspection = inspection; }
    public FirstInstallmentDTO getFirstInstallment() { return firstInstallment; }
    public void setFirstInstallment(FirstInstallmentDTO firstInstallment) { this.firstInstallment = firstInstallment; }
    public List<ParticipantDTO> getParticipants() { return participants; }
    public void setParticipants(List<ParticipantDTO> participants) { this.participants = participants; }
    public BusinessAgentDTO getBusinessAgent() { return businessAgent; }
    public void setBusinessAgent(BusinessAgentDTO businessAgent) { this.businessAgent = businessAgent; }
    public PromoterDTO getPromoter() { return promoter; }
    public void setPromoter(PromoterDTO promoter) { this.promoter = promoter; }
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    public String getProductDescription() { return productDescription; }
    public void setProductDescription(String productDescription) { this.productDescription = productDescription; }
    public String getExternalQuotationId() { return externalQuotationId; }
    public void setExternalQuotationId(String externalQuotationId) { this.externalQuotationId = externalQuotationId; }
    public String getExternalPolicyNumber() { return externalPolicyNumber; }
    public void setExternalPolicyNumber(String externalPolicyNumber) { this.externalPolicyNumber = externalPolicyNumber; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyDTO{");
        sb.append("productPlan=").append(productPlan);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", insuredAmount=").append(insuredAmount);
        sb.append(", isDataTreatment=").append(isDataTreatment);
        sb.append(", relatedContracts=").append(relatedContracts);
        sb.append(", installmentPlan=").append(installmentPlan);
        sb.append(", hasAcceptedContract=").append(hasAcceptedContract);
        sb.append(", inspection=").append(inspection);
        sb.append(", firstInstallment=").append(firstInstallment);
        sb.append(", participants=").append(participants);
        sb.append(", businessAgent=").append(businessAgent);
        sb.append(", promoter=").append(promoter);
        sb.append(", policyNumber='").append(policyNumber).append('\'');
        sb.append(", productDescription='").append(productDescription).append('\'');
        sb.append(", externalQuotationId='").append(externalQuotationId).append('\'');
        sb.append(", externalPolicyNumber='").append(externalPolicyNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
