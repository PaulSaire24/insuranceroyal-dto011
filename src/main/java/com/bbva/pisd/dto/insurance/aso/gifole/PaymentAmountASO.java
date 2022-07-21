package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class PaymentAmountASO extends CommonFieldsASO{
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentAmountASO{");
        sb.append("amount=").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
