package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.HolderDTO;

public class BusinessAgentDTO extends HolderDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BusinessAgentDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", fullName='").append(this.getFullName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
