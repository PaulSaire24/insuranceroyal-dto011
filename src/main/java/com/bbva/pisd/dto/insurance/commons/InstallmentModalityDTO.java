package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class InstallmentModalityDTO extends AbstractDTO {

    private PaymentPeriodDTO period;
    private InsurancePrimeAmountDTO amount;
    private NotAdjustedAmountDTO notAdjustedAmount;
    private InsuranceFinancingDTO financing;

    public PaymentPeriodDTO getPeriod() { return period; }
    public void setPeriod(PaymentPeriodDTO period) { this.period = period; }
    public InsurancePrimeAmountDTO getAmount() { return amount; }
    public void setAmount(InsurancePrimeAmountDTO amount) { this.amount = amount; }
    public InsuranceFinancingDTO getFinancing() { return financing; }
    public void setFinancing(InsuranceFinancingDTO financing) { this.financing = financing; }
    public NotAdjustedAmountDTO getNotAdjustedAmount() { return notAdjustedAmount; }
    public void setNotAdjustedAmount(NotAdjustedAmountDTO notAdjustedAmount) { this.notAdjustedAmount = notAdjustedAmount; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentModalityDTO{");
        sb.append("period=").append(period);
        sb.append(", amount=").append(amount);
        sb.append(", notAdjustedAmount=").append(notAdjustedAmount);
        sb.append(", financing=").append(financing);
        sb.append('}');
        return sb.toString();
    }
}
