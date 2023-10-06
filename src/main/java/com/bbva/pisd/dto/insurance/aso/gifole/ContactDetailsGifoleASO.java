package com.bbva.pisd.dto.insurance.aso.gifole;

import java.io.Serializable;

public class ContactDetailsGifoleASO implements Serializable {

    private static final long serialVersionUID = 566501407248073L;

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
