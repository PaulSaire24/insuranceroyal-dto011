package com.bbva.pisd.dto.insurance.bo.customer;

import com.bbva.pisd.dto.insurance.bo.*;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerBO {

    private String firstName;
    private String lastName;
    private String secondLastName;
    private BirthDataBO birthData;
    private List<NationalitiesBO> nationalities;
    private List<IdentityDocumentsBO> identityDocuments;
    private GenderBO gender;
    private List<ContactDetailsBO> contactDetails;
    private List<AddressesBO> addresses;

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSecondLastName() {
        return secondLastName;
    }
    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }
    public BirthDataBO getBirthData() { return birthData; }
    public void setBirthData(BirthDataBO birthData) { this.birthData = birthData; }
    public List<NationalitiesBO> getNationalities() { return nationalities; }
    public void setNationalities(List<NationalitiesBO> nationalities) { this.nationalities = nationalities; }
    public List<IdentityDocumentsBO> getIdentityDocuments() { return identityDocuments; }
    public void setIdentityDocuments(List<IdentityDocumentsBO> identityDocuments) { this.identityDocuments = identityDocuments; }
    public GenderBO getGender() { return gender; }
    public void setGender(GenderBO gender) { this.gender = gender; }
    public List<ContactDetailsBO> getContactDetails() { return contactDetails; }
    public void setContactDetails(List<ContactDetailsBO> contactDetails) { this.contactDetails = contactDetails; }
    public List<AddressesBO> getAddresses() { return addresses; }
    public void setAddresses(List<AddressesBO> addresses) { this.addresses = addresses; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerBO{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", secondLastName='").append(secondLastName).append('\'');
        sb.append(", birthData=").append(birthData);
        sb.append(", nationalities=").append(nationalities);
        sb.append(", identityDocuments=").append(identityDocuments);
        sb.append(", gender=").append(gender);
        sb.append(", addresses=").append(addresses);
        sb.append('}');
        return sb.toString();
    }
}
