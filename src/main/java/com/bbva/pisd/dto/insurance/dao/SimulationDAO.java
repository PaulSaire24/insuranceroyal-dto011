package com.bbva.pisd.dto.insurance.dao;

import java.math.BigDecimal;

public class SimulationDAO extends CommonsDAO {

    private String insrncCompanySimulationId;
    private String customerSimulationDate;
    private String custSimulationExpiredDate;
    private String bankFactorType;
    private BigDecimal bankFactorAmount;
    private BigDecimal bankFactorPer;

    public String getInsrncCompanySimulationId() { return insrncCompanySimulationId; }
    public void setInsrncCompanySimulationId(String insrncCompanySimulationId) { this.insrncCompanySimulationId = insrncCompanySimulationId; }
    public String getCustomerSimulationDate() { return customerSimulationDate; }
    public void setCustomerSimulationDate(String customerSimulationDate) { this.customerSimulationDate = customerSimulationDate; }
    public String getCustSimulationExpiredDate() { return custSimulationExpiredDate; }
    public void setCustSimulationExpiredDate(String custSimulationExpiredDate) { this.custSimulationExpiredDate = custSimulationExpiredDate; }
    public String getBankFactorType() { return bankFactorType; }
    public void setBankFactorType(String bankFactorType) { this.bankFactorType = bankFactorType; }
    public BigDecimal getBankFactorAmount() { return bankFactorAmount; }
    public void setBankFactorAmount(BigDecimal bankFactorAmount) { this.bankFactorAmount = bankFactorAmount; }
    public BigDecimal getBankFactorPer() { return bankFactorPer; }
    public void setBankFactorPer(BigDecimal bankFactorPer) { this.bankFactorPer = bankFactorPer; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimulationDAO{");
        sb.append("insuranceSimulationId=").append(this.getInsuranceSimulationId());
        sb.append(", insrncCompanySimulationId='").append(insrncCompanySimulationId).append('\'');
        sb.append(", customerId='").append(this.getCustomerId()).append('\'');
        sb.append(", customerSimulationDate='").append(customerSimulationDate).append('\'');
        sb.append(", custSimulationExpiredDate='").append(custSimulationExpiredDate).append('\'');
        sb.append(", bankFactorType='").append(bankFactorType).append('\'');
        sb.append(", bankFactorAmount=").append(bankFactorAmount);
        sb.append(", bankFactorPer=").append(bankFactorPer);
        sb.append('}');
        return sb.toString();
    }

}