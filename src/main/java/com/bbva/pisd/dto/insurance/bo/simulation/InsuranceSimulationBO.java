package com.bbva.pisd.dto.insurance.bo.simulation;

import com.bbva.pisd.dto.insurance.bo.SimulacionPayloadBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InsuranceSimulationBO {

    private SimulacionPayloadBO payload;

    public SimulacionPayloadBO getPayload() { return payload; }
    public void setPayload(SimulacionPayloadBO payload) { this.payload = payload; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSimulationBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }
}