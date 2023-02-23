package com.bbva.pisd.dto.insurance.bo.valorcomercial;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.bbva.pisd.dto.insurance.bo.ValorComercialPayloadBO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommercialValueBO {
    private ValorComercialPayloadBO payload;

    /**
     * @return ValorComercialPayloadBO return the payload
     */
    public ValorComercialPayloadBO getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(ValorComercialPayloadBO payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommercialValueBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }
}
