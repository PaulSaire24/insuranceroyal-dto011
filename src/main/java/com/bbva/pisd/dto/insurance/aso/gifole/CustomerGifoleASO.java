package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

import java.io.Serializable;
import java.util.List;

public class CustomerGifoleASO extends CommonFieldsASO  implements Serializable {

    private static final long serialVersionUID = 71001407248073L;

    public CustomerGifoleASO() {
        this.setId("99999999");
        this.setName("ROYAL");
        this.setLastName("ROYAL");
        this.secondLastName = "";
    }

    private String lastName;
    private String secondLastName;
    private String fullName;
    private List<IdentityDocumentGifoleASO> identityDocuments;
    private List<ContactDetailsGifoleASO> contactDetails;

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getSecondLastName() { return secondLastName; }
    public void setSecondLastName(String secondLastName) { this.secondLastName = secondLastName; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public List<IdentityDocumentGifoleASO> getIdentityDocuments() { return identityDocuments; }
    public void setIdentityDocuments(List<IdentityDocumentGifoleASO> identityDocuments) { this.identityDocuments = identityDocuments; }
    public List<ContactDetailsGifoleASO> getContactDetails() { return contactDetails; }
    public void setContactDetails(List<ContactDetailsGifoleASO> contactDetails) { this.contactDetails = contactDetails; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerGifoleASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", secondLastName='").append(secondLastName).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", identityDocuments=").append(identityDocuments);
        sb.append(", contactDetails=").append(contactDetails);
        sb.append('}');
        return sb.toString();
    }

}
