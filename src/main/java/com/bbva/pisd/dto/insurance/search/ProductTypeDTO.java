package com.bbva.pisd.dto.insurance.search;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class ProductTypeDTO extends CommonDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductTypeDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
