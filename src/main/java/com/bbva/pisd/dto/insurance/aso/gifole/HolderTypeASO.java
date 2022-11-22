package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class HolderTypeASO extends CommonFieldsASO{
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderTypeASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}