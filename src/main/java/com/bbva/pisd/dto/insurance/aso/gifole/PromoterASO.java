package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class PromoterASO extends CommonFieldsASO {

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PromoterASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
