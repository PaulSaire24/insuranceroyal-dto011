package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class IdentityDocumentDTO extends AbstractDTO {

    private DocumentTypeDTO documentType;
    private String documentNumber;
    private String number;

	public DocumentTypeDTO getDocumentType() { return documentType; }
    public void setDocumentType(DocumentTypeDTO documentType) { this.documentType = documentType; }
    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public IdentityDocumentDTO(DocumentTypeDTO documentType, String documentNumber) {
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.number = documentNumber;
	}
    
	public IdentityDocumentDTO() { }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdentityDocumentDTO{");
        sb.append("documentType=").append(documentType);
        sb.append(", documentNumber='").append(documentNumber).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
