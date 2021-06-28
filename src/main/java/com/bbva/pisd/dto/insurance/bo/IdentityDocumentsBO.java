package com.bbva.pisd.dto.insurance.bo;

public class IdentityDocumentsBO {

    private DocumentTypeBO documentType;
    private String expirationDate;
    private String documentNumber;

    public DocumentTypeBO getDocumentType() { return documentType; }
    public void setDocumentType(DocumentTypeBO documentType) { this.documentType = documentType; }
    public String getExpirationDate() { return expirationDate; }
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }
    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdentityDocumentsBO{");
        sb.append("expirationDate='").append(expirationDate).append('\'');
        sb.append(", documentNumber='").append(documentNumber).append('\'');
        sb.append(", documentType=").append(documentType);
        sb.append('}');
        return sb.toString();
    }
}
