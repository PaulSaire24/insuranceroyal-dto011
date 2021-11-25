package com.bbva.pisd.dto.insurance.search;


import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.IdentityDocumentDTO;

public class InsuranceSearchDTO extends CommonOutputFieldsDTO {

    private IdentityDocumentDTO document;

    public IdentityDocumentDTO getDocument() { return document; }
    public void setDocument(IdentityDocumentDTO document) { this.document = document; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSearchDTO{");
        sb.append("document=").append(document);
        sb.append(", vehicle='").append(this.getVehicle()).append('\'');
        sb.append(", product='").append(this.getProduct()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
