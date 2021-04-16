package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class NotAdjustedAmountDTO extends AbstractDTO {

    private String id;
    private String name;
    private InsurancePrimeAmountDTO amount;
    private String percentage;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public InsurancePrimeAmountDTO getAmount() { return amount; }
    public void setAmount(InsurancePrimeAmountDTO amount) { this.amount = amount; }
    public String getPercentage() { return percentage; }
    public void setPercentage(String percentage) { this.percentage = percentage; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotAdjustedAmountDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", percentage=").append(percentage);
        sb.append('}');
        return sb.toString();
    }
}
