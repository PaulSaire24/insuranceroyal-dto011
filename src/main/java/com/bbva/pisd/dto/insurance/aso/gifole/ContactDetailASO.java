package com.bbva.pisd.dto.insurance.aso.gifole;

public class ContactDetailASO {

    private ContactASO contact;

    public ContactASO getContact() {return contact;}
    public void setContact(ContactASO contact) {this.contact = contact;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactDetailASO{");
        sb.append("contact=").append(contact);
        sb.append('}');
        return sb.toString();
    }

}
