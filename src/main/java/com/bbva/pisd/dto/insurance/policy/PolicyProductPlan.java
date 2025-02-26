package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class PolicyProductPlan extends CommonOutputFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PolicyProductPlan{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
