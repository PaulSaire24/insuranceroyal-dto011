package com.bbva.pisd.dto.insurance.aso.gifole;

import java.math.BigDecimal;

public class AmountASO {

    private BigDecimal amount;
    private String currency;

    public BigDecimal getAmount() {return amount;}
    public void setAmount(BigDecimal amount) {this.amount = amount;}
    public String getCurrency() {return currency;}
    public void setCurrency(String currency) {this.currency = currency;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AmountASO{");
        sb.append("amount=").append(amount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
