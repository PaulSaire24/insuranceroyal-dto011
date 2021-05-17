package com.bbva.pisd.dto.insurance.policy;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class PolicyPaymentMethodDTO extends AbstractDTO {

    private String paymentType;
    private String installmentFrequency;
    private List<RelatedContractDTO> relatedContracts;

    public String getPaymentType() { return paymentType; }
    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }
    public String getInstallmentFrequency() { return installmentFrequency; }
    public void setInstallmentFrequency(String installmentFrequency) { this.installmentFrequency = installmentFrequency; }
    public List<RelatedContractDTO> getRelatedContracts() { return relatedContracts; }
    public void setRelatedContracts(List<RelatedContractDTO> relatedContracts) { this.relatedContracts = relatedContracts; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyPaymentMethod{");
        sb.append("paymentType='").append(paymentType).append('\'');
        sb.append(", installmentFrequency='").append(installmentFrequency).append('\'');
        sb.append(", relatedContracts=").append(relatedContracts);
        sb.append('}');
        return sb.toString();
    }

}
