package com.bbva.pisd.dto.insurance.commons;

public class IdentityDocumentDTO extends CommonDTO {

    private DocumentTypeDTO documentType;
    private String documentNumber;

	public DocumentTypeDTO getDocumentType() { return documentType; }
    public void setDocumentType(DocumentTypeDTO documentType) { this.documentType = documentType; }
    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }

    public IdentityDocumentDTO(DocumentTypeDTO documentType, String documentNumber) {
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.setNumber(documentNumber);
	}
    
	public IdentityDocumentDTO() { }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdentityDocumentDTO{");
        sb.append("documentType=").append(documentType);
        sb.append(", documentNumber='").append(documentNumber).append('\'');
        sb.append(", number='").append(this.getNumber()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
