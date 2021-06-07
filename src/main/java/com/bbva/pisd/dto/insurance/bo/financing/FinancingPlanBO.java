package com.bbva.pisd.dto.insurance.bo.financing;

public class FinancingPlanBO {

    private FinanciamientoPayloadBO payload;

    public FinanciamientoPayloadBO getPayload() {
        return payload;
    }

    public void setPayload(FinanciamientoPayloadBO payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSimulationBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }
}