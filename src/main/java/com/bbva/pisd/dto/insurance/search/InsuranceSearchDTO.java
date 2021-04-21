package com.bbva.pisd.dto.insurance.search;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.pisd.dto.insurance.commons.IdentityDocumentDTO;

public class InsuranceSearchDTO extends AbstractDTO {

    private IdentityDocumentDTO document;
    private String licensePlate;
    private String traceId;

    public IdentityDocumentDTO getDocument() { return document; }
    public void setDocument(IdentityDocumentDTO document) { this.document = document; }
    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }
    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSearchDTO{");
        sb.append("document=").append(document);
        sb.append(", licensePlate='").append(licensePlate).append('\'');
        sb.append(", traceId='").append(traceId).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
