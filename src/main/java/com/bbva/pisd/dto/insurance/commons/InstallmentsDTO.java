package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

import java.util.Date;

public class InstallmentsDTO extends AbstractDTO {

    private Long paymentNumber;
    private BillAmountDTO amount;
    private Date maturityDate;

    public Long getPaymentNumber() { return paymentNumber; }
    public void setPaymentNumber(Long paymentNumber) { this.paymentNumber = paymentNumber; }
    public BillAmountDTO getAmount() { return amount; }
    public void setAmount(BillAmountDTO amount) { this.amount = amount; }
    public Date getMaturityDate() { return maturityDate; }
    public void setMaturityDate(Date maturityDate) { this.maturityDate = maturityDate; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentsSimulationDTO{");
        sb.append("paymentNumber=").append(paymentNumber);
        sb.append(", amount=").append(amount);
        sb.append(", maturityDate='").append(maturityDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
