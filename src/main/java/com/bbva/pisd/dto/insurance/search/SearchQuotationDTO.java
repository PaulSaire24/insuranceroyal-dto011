package com.bbva.pisd.dto.insurance.search;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class SearchQuotationDTO extends CommonOutputFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchQuotationDTO{");
        sb.append("holder=").append(this.getHolder());
        sb.append(", licensePlate='").append(this.getLicensePlate()).append('\'');
        sb.append(", id='").append(this.getId()).append('\'');
        sb.append(", operationDate=").append(this.getOperationDate());
        sb.append(", maturityDate=").append(this.getMaturityDate());
        sb.append(", product=").append(this.getProduct());
        sb.append(", status=").append(this.getStatus());
        sb.append(", model=").append(this.getModel());

        sb.append('}');
        return sb.toString();
    }

}
