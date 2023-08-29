package com.bbva.pisd.dto.insurance.simulation;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GifoleInternalSimulationDTO implements Serializable {

    private static final long serialVersionUID = 515344646962447385L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GifoleInternalSimulationDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
