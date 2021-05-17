package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class ContractDetailsDTO extends CommonDTO {

    private String contractType;
    private String contractId;
    private NumberTypeDTO numberType;
    private FinancialProductDTO product;

    public String getContractType() { return contractType; }
    public void setContractType(String contractType) { this.contractType = contractType; }
    public String getContractId() { return contractId; }
    public void setContractId(String contractId) { this.contractId = contractId; }
    public NumberTypeDTO getNumberType() { return numberType; }
    public void setNumberType(NumberTypeDTO numberType) { this.numberType = numberType; }
    public FinancialProductDTO getProduct() { return product; }
    public void setProduct(FinancialProductDTO product) { this.product = product; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactDetailsDTO{");
        sb.append("contractType='").append(contractType).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append(", contractId='").append(contractId).append('\'');
        sb.append(", number='").append(this.getNumber()).append('\'');
        sb.append(", numberType=").append(numberType);
        sb.append(", product=").append(product);
        sb.append('}');
        return sb.toString();
    }

}
