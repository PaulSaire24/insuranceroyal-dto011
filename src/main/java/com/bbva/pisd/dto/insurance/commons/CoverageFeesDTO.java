package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class CoverageFeesDTO extends AbstractDTO {

    private PaymentAmount paymentAmount;

    public PaymentAmount getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(PaymentAmount paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageFeesDTO{");
        sb.append("paymentAmount=").append(paymentAmount);
        sb.append('}');
        return sb.toString();
    }
}
