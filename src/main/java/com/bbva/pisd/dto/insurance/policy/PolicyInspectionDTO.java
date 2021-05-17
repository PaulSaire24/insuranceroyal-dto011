package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.HolderDTO;

public class PolicyInspectionDTO extends HolderDTO {

    private boolean isRequired;

    public boolean isRequired() { return isRequired; }
    public void setRequired(boolean required) { isRequired = required; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InspectionDTO{");
        sb.append("isRequired=").append(isRequired);
        sb.append(", fullName='").append(this.getFullName()).append('\'');
        sb.append(", contactDetails=").append(this.getContactDetails());
        sb.append('}');
        return sb.toString();
    }

}
