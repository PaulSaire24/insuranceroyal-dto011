package com.bbva.pisd.dto.insurance.bo.financing;

import com.bbva.pisd.dto.insurance.bo.FinanciamientoBO;

public class CronogramaPagoLifeBO {

    private FinanciamientoBO payload;

    public FinanciamientoBO getPayload() {
        return payload;
    }

    public void setPayload(FinanciamientoBO payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CronogramaPagoLifeBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }
}
