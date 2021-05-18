package com.bbva.pisd.dto.insurance.policy;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

import java.util.Date;

public class FirstInstallmentDTO extends CommonOutputFieldsDTO {

    private Date firstPaymentDate;
    private boolean isPaymentRequired;
    private String operationNumber;
    private String transactionNumber;
    private ExchangeRateDTO exchangeRate;

    public Date getFirstPaymentDate() { return firstPaymentDate; }
    public void setFirstPaymentDate(Date firstPaymentDate) { this.firstPaymentDate = firstPaymentDate; }
    public boolean isPaymentRequired() { return isPaymentRequired; }
    public void setPaymentRequired(boolean paymentRequired) { isPaymentRequired = paymentRequired; }
    public String getOperationNumber() { return operationNumber; }
    public void setOperationNumber(String operationNumber) { this.operationNumber = operationNumber; }
    public String getTransactionNumber() { return transactionNumber; }
    public void setTransactionNumber(String transactionNumber) { this.transactionNumber = transactionNumber; }
    public ExchangeRateDTO getExchangeRate() { return exchangeRate; }
    public void setExchangeRate(ExchangeRateDTO exchangeRate) { this.exchangeRate = exchangeRate; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FirstInstallmentDTO{");
        sb.append("firstPaymentDate='").append(firstPaymentDate).append('\'');
        sb.append(", isPaymentRequired=").append(isPaymentRequired);
        sb.append(", paymentAmount=").append(this.getPaymentAmount());
        sb.append(", operationNumber='").append(operationNumber).append('\'');
        sb.append(", transactionNumber='").append(transactionNumber).append('\'');
        sb.append(", operationDate='").append(this.getOperationDate()).append('\'');
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append('}');
        return sb.toString();
    }

}
