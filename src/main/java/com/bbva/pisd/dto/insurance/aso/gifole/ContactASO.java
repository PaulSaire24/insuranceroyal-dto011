package com.bbva.pisd.dto.insurance.aso.gifole;

public class ContactASO {

    private String contactType;
    private String address;
    private String phoneNumber;

    public String getContactType() {return contactType;}
    public void setContactType(String contactType) {this.contactType = contactType;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactASO{");
        sb.append("contactType='").append(contactType).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append('}');
        return sb.toString();
    }

}
