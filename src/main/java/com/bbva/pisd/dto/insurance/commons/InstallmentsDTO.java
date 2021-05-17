package com.bbva.pisd.dto.insurance.commons;

public class InstallmentsDTO extends CommonOutputFieldsDTO {

    private Long paymentNumber;
    private BillAmountDTO amount;

    public Long getPaymentNumber() { return paymentNumber; }
    public void setPaymentNumber(Long paymentNumber) { this.paymentNumber = paymentNumber; }
    public BillAmountDTO getAmount() { return amount; }
    public void setAmount(BillAmountDTO amount) { this.amount = amount; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentsSimulationDTO{");
        sb.append("paymentNumber=").append(paymentNumber);
        sb.append(", amount=").append(amount);
        sb.append(", maturityDate='").append(this.getMaturityDate()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
