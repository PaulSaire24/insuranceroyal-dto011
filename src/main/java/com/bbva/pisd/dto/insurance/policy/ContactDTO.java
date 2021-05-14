package com.bbva.pisd.dto.insurance.policy;

import com.bbva.apx.dto.AbstractDTO;

public class ContactDTO extends AbstractDTO {

    private String contactDetailType;
    private String address;
    private String phoneNumber;

    public String getContactDetailType() { return contactDetailType; }
    public void setContactDetailType(String contactDetailType) { this.contactDetailType = contactDetailType; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderContactDTO{");
        sb.append("contactDetailType='").append(contactDetailType).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
