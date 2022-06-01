package com.bbva.pisd.dto.insurance.bo;


public class SearchQuotationBO extends CommonOutputFieldsBO {

    private SearchQuotationPaginationBO payload;

    public SearchQuotationPaginationBO getPayload() {
        return payload;
    }

    public void setPayload(SearchQuotationPaginationBO payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchQuotationBO{");
        sb.append("payload=").append(payload);
        sb.append(", error=").append(this.getError());
        sb.append('}');
        return sb.toString();
    }

}
