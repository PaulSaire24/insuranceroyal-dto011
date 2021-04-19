package com.bbva.pisd.dto.insurance.aso.gifole;

public class ContactDetailsGifoleASO {

    private ContactGifoleASO contact;

    public ContactGifoleASO getContact() { return contact; }
    public void setContact(ContactGifoleASO contact) { this.contact = contact; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactDetailsGifoleASO{");
        sb.append("contact=").append(contact);
        sb.append('}');
        return sb.toString();
    }

}
