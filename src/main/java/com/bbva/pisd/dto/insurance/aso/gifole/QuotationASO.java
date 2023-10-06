package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

import java.io.Serializable;

public class QuotationASO  extends CommonFieldsASO implements Serializable{
    private static final long serialVersionUID = 207781407248L;
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
