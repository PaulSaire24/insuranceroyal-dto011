package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactDetailsBO {

    private String contactDetailId;
    private String contact;
    private ContactTypeBO contactType;
    private CountryBO country;
    private String regionalCode;
    private String extension;
    private String isPreferential;
    private String isChecked;

    public ContactTypeBO getContactType() { return contactType; }
    public void setContactType(ContactTypeBO contactType) { this.contactType = contactType; }
    public String getContactDetailId() { return contactDetailId; }
    public void setContactDetailId(String contactDetailId) { this.contactDetailId = contactDetailId; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
    public CountryBO getCountry() { return country; }
    public void setCountry(CountryBO country) { this.country = country; }
    public String getRegionalCode() { return regionalCode; }
    public void setRegionalCode(String regionalCode) { this.regionalCode = regionalCode; }
    public String getExtension() { return extension; }
    public void setExtension(String extension) { this.extension = extension; }
    public String getIsPreferential() { return isPreferential; }
    public void setIsPreferential(String isPreferential) { this.isPreferential = isPreferential; }
    public String getIsChecked() { return isChecked; }
    public void setIsChecked(String isChecked) { this.isChecked = isChecked; }

}
