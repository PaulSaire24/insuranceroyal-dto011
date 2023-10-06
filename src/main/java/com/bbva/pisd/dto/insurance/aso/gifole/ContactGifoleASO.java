package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

import java.io.Serializable;

public class ContactGifoleASO extends CommonFieldsASO implements Serializable {

    private static final long serialVersionUID = 801407248073L;

    private String address;
    private String contactDetailType;

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getContactDetailType() { return contactDetailType; }
    public void setContactDetailType(String contactDetailType) { this.contactDetailType = contactDetailType; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactGifoleASO{");
        sb.append("number='").append(this.getNumber()).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", contactDetailType='").append(contactDetailType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}