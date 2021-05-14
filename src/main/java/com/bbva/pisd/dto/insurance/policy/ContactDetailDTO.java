package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class ContactDetailDTO extends CommonDTO {

    private ContactDTO contact;

    public ContactDTO getContact() { return contact; }
    public void setContact(ContactDTO contact) { this.contact = contact; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderContactDetail{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", contact=").append(contact);
        sb.append('}');
        return sb.toString();
    }

}
