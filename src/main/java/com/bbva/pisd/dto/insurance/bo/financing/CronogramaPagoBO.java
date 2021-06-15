package com.bbva.pisd.dto.insurance.bo.financing;

import java.util.List;
import com.bbva.pisd.dto.insurance.bo.FinanciamientoBO;

public class CronogramaPagoBO {
    private List<FinanciamientoBO> payload;

    public List<FinanciamientoBO> getPayload() { return payload; }
    public void setPayload(List<FinanciamientoBO> payload) { this.payload = payload; }

    @Override
    public String toString() {
        return "CronogramaPagoBO{" +
                "payload=" + payload +
                '}';
    }
}
