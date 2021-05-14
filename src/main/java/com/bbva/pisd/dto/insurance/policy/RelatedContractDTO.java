package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class RelatedContractDTO extends CommonDTO {

    private RelatedContractProductDTO product;
    private RelationTypeDTO relationType;
    private ContractDetailsDTO contractDetails;

    public RelatedContractProductDTO getProduct() { return product; }
    public void setProduct(RelatedContractProductDTO product) { this.product = product; }
    public RelationTypeDTO getRelationType() { return relationType; }
    public void setRelationType(RelationTypeDTO relationType) { this.relationType = relationType; }
    public ContractDetailsDTO getContractDetails() { return contractDetails; }
    public void setContractDetails(ContractDetailsDTO contractDetails) { this.contractDetails = contractDetails; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyRelatedContractDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", number='").append(this.getNumber()).append('\'');
        sb.append(", product=").append(product);
        sb.append(", relationType=").append(relationType);
        sb.append(", contractDetails=").append(contractDetails);
        sb.append('}');
        return sb.toString();
    }

}
