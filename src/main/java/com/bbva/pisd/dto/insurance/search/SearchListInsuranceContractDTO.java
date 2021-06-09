package com.bbva.pisd.dto.insurance.search;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.LinkDTO;


public class SearchListInsuranceContractDTO extends CommonOutputFieldsDTO {

    private String insuranceContractId;
    private String documentType;
    private LinkDTO link;

    public String getInsuranceContractId() { return insuranceContractId; }
    public void setInsuranceContractId(String insuranceContractId) { this.insuranceContractId = insuranceContractId; }
    public String getDocumentType() {return documentType; }
    public void setDocumentType(String documentType) { this.documentType = documentType; }
    public LinkDTO getLink() { return link; }
    public void setLink(LinkDTO link) { this.link = link;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchListInsuranceContractDTO{");
        sb.append("insuranceContractId=").append(insuranceContractId).append('\'');
        sb.append(", documentType=").append(documentType).append('\'');
        sb.append(", link=").append(link);
        sb.append('}');
        return sb.toString();
    }

}
