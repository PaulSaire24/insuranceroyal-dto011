package com.bbva.pisd.dto.insurance.bo.detail;

import com.bbva.pisd.dto.insurance.bo.QuotationDetailPayloadBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InsuranceQuotationDetailBO {

    private List<QuotationDetailPayloadBO> payload;

    public List<QuotationDetailPayloadBO> getPayload() { return payload; }
    public void setPayload(List<QuotationDetailPayloadBO> payload) { this.payload = payload; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceQuotationDetailBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }

}
