package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class ParticipantTypeDTO extends CommonDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParticipantTypeDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
