package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class PolicyDurationDTO extends CommonDTO {


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyDurationDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", number=").append(this.getNumber());
        sb.append('}');
        return sb.toString();
    }

}
