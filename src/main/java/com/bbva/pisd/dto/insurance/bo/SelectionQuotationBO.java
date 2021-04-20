package com.bbva.pisd.dto.insurance.bo;

public class SelectionQuotationBO {

    private SelectionQuotationPayloadBO payload;
    private ErrorBO error;

    public SelectionQuotationPayloadBO getPayload() { return payload; }
    public void setPayload(SelectionQuotationPayloadBO payload) { this.payload = payload; }
    public ErrorBO getError() { return error; }
    public void setError(ErrorBO error) { this.error = error; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSelectionBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }

}
