package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectionQuotationBO extends CommonOutputFieldsBO {

    private SelectionQuotationPayloadBO payload;

    public SelectionQuotationPayloadBO getPayload() { return payload; }
    public void setPayload(SelectionQuotationPayloadBO payload) { this.payload = payload; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSelectionBO{");
        sb.append("payload=").append(payload);
        sb.append(", error=").append(this.getError());
        sb.append('}');
        return sb.toString();
    }

}
