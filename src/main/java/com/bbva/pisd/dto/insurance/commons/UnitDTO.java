package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class UnitDTO extends AbstractDTO {

    private String unitType;
    private Double amount;
    private String currency;
    private Double percentage;
    private String text;
    private Double decimal;

    public String getUnitType() { return unitType; }
    public void setUnitType(String unitType) { this.unitType = unitType; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public Double getPercentage() { return percentage; }
    public void setPercentage(Double percentage) { this.percentage = percentage; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public Double getDecimal() { return decimal; }
    public void setDecimal(Double decimal) { this.decimal = decimal; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnitDTO{");
        sb.append("unitType='").append(unitType).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", percentage=").append(percentage);
        sb.append(", text='").append(text).append('\'');
        sb.append(", decimal=").append(decimal);
        sb.append('}');
        return sb.toString();
    }

}
