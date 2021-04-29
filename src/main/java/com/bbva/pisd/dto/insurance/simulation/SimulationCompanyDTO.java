package com.bbva.pisd.dto.insurance.simulation;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class SimulationCompanyDTO extends CommonDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimulationCompanyDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
