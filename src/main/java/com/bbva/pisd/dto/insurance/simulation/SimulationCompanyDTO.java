package com.bbva.pisd.dto.insurance.simulation;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class SimulationCompanyDTO extends CommonDTO {

    private static final long serialVersionUID = 2077814072480734189L;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimulationCompanyDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
