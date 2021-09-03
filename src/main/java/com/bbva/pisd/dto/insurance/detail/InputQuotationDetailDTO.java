package com.bbva.pisd.dto.insurance.detail;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class InputQuotationDetailDTO extends CommonOutputFieldsDTO {

    public InputQuotationDetailDTO() {}

    public InputQuotationDetailDTO(String id, String traceId, String saleChannelId) {
        this.setId(id);
        this.setTraceId(traceId);
        this.setSaleChannelId(saleChannelId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InputQuotationDetailDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", traceId='").append(this.getTraceId()).append('\'');
        sb.append(", saleChannelId='").append(this.getSaleChannelId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
