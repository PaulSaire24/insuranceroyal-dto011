package com.bbva.pisd.dto.insurance.commons;

public class DocumentTypeDTO extends CommonOutputFieldsDTO {

    private String name;

	public DocumentTypeDTO(String id) {
	    this.setId(id);

	}
	public DocumentTypeDTO() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentTypeDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
