package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class HolderDTO extends AbstractDTO {

    private String id;
    private String fullName;
    private IdentityDocumentDTO identityDocument;
    private List<ContactDetailDTO> contactDetails;
    //Inicio Open Market
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Fin Open Market

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public IdentityDocumentDTO getIdentityDocument() { return identityDocument; }
    public void setIdentityDocument(IdentityDocumentDTO identityDocument) { this.identityDocument = identityDocument; }
    public List<ContactDetailDTO> getContactDetails() { return contactDetails; }
    public void setContactDetails(List<ContactDetailDTO> contactDetails) { this.contactDetails = contactDetails; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", identityDocument=").append(identityDocument);
        sb.append(", contactDetails=").append(contactDetails);
        sb.append('}');
        return sb.toString();
    }

}
