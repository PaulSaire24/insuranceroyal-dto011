package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class HolderDTO extends AbstractDTO {

    private String id;
    private String fullName;
    private IdentityDocumentDTO identityDocument;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public IdentityDocumentDTO getIdentityDocument() { return identityDocument; }
    public void setIdentityDocument(IdentityDocumentDTO identityDocument) { this.identityDocument = identityDocument; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", fullName='").append(this.getFullName()).append('\'');
        sb.append(", identityDocument=").append(identityDocument);
        sb.append('}');
        return sb.toString();
    }

}
