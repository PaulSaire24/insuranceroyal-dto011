package com.bbva.pisd.dto.insurance.bo.registeradditional;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidateGeneralDataBO {

    private ValidateGeneralDataPayloadBO payload;

    public ValidateGeneralDataPayloadBO getPayload() {return payload;}
    public void setPayload(ValidateGeneralDataPayloadBO payload) {this.payload = payload;}

}
