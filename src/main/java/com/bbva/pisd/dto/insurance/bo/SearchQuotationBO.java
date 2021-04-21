package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class SearchQuotationBO {

    private List<SearchPayloadBO> payload;

    public List<SearchPayloadBO> getPayload() {
        return payload;
    }

    public void setPayload(List<SearchPayloadBO> payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSearchBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }

}
