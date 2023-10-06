package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

import java.io.Serializable;

public class DocumentTypeASO extends CommonFieldsASO implements Serializable {

    private static final long serialVersionUID = 9081407248073L;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentTypeASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
