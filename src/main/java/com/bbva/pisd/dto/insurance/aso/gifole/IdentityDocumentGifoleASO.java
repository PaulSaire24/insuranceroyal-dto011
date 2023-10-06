package com.bbva.pisd.dto.insurance.aso.gifole;

import java.io.Serializable;

public class IdentityDocumentGifoleASO implements Serializable {

    private static final long serialVersionUID = 865156167248073L;

    private DocumentTypeASO documentType;
    private String documentNumber;

    public DocumentTypeASO getDocumentType() { return documentType; }
    public void setDocumentType(DocumentTypeASO documentType) { this.documentType = documentType; }
    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdentityDocumentGifoleASO{");
        sb.append("documentType=").append(documentType);
        sb.append(", documentNumber='").append(documentNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
