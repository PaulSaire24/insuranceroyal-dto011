package com.bbva.pisd.dto.insurance.commons;

public class QuotationStatusDTO extends CommonDTO {

    public QuotationStatusDTO() {

    }

    public QuotationStatusDTO(String id) {
        this.setId(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationStatusDTO{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
