package com.bbva.pisd.dto.insurance.commons;

public class DocumentTypeDTO extends CommonOutputFieldsDTO {

	public DocumentTypeDTO(String id) {
	    this.setId(id);

	}
	public DocumentTypeDTO() { }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentTypeDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
