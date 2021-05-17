package com.bbva.pisd.dto.insurance.bo.registeradditional;

import com.bbva.pisd.dto.insurance.bo.RegisterAdditionalVehPayloadBO;

public class RegisterAdditionalVehBO {

    private RegisterAdditionalVehPayloadBO payload;

    public RegisterAdditionalVehPayloadBO getPayload() {
        return payload;
    }

    public void setPayload(RegisterAdditionalVehPayloadBO payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAdditionalVehBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }
}
