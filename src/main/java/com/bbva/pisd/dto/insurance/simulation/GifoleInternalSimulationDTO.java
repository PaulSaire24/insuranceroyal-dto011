package com.bbva.pisd.dto.insurance.simulation;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GifoleInternalSimulationDTO implements Serializable {

    private static final long serialVersionUID = 515344646962447385L;

    private BigDecimal id;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GifoleInternalSimulationDTO{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
