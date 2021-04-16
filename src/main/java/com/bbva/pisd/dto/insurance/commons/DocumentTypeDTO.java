package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class DocumentTypeDTO extends AbstractDTO {

    private String id;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

	public DocumentTypeDTO(String id) { this.id = id; }
	public DocumentTypeDTO() { }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentTypeDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
