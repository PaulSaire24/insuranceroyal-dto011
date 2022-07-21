package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class CoverageFeeASO extends CommonFieldsASO{

    private PaymentAmountASO paymentAmount;
    private UnitASO unit;

    public PaymentAmountASO getPaymentAmount() {return paymentAmount;}
    public void setPaymentAmount(PaymentAmountASO paymentAmount) {this.paymentAmount = paymentAmount;}
    public UnitASO getUnit() {return unit;}
    public void setUnit(UnitASO unit) {this.unit = unit;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageFeeASO{");
        sb.append("paymentAmount=").append(paymentAmount);
        sb.append(", unit=").append(unit).append('\'');
        sb.append(", percentageValue='").append(this.getPercentageValue()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
