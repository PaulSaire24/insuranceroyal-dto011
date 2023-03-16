package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.commons.ScheduleContactDTO;

public class GifoleInsuranceRequestASO {

    private ProductASO product;
    private GoodASO good;
    private InstallmentPlanASO installmentPlan;
    private AmountASO totalPremiumAmount;
    private HolderASO holder;
    private String channel;
    private String operationDate;
    private String operationType;
    private BankASO bank;
    private QuotationASO quotation;
    private BusinessAgentASO businessAgent;
    //Inicio Open Market
    private ScheduleContactDTO scheduleContact;

    //Inicio Emision Gifole
    private ValidityPeriodASO validityPeriod;
    private InsuranceASO insurance;
    private String policyNumber;
    //externalSimulationId
    private String externalSimulationId;
    public String getExternalSimulationId() {return externalSimulationId;}
	public void setExternalSimulationId(String externalSimulationId) {this.externalSimulationId = externalSimulationId;}

	public ScheduleContactDTO getScheduleContact() {
        return scheduleContact;
    }

    public void setScheduleContact(ScheduleContactDTO scheduleContact) {
        this.scheduleContact = scheduleContact;
    }
    //Fin Open Market

    public ProductASO getProduct() {return product;}
    public void setProduct(ProductASO product) {this.product = product;}
    public GoodASO getGood() {return good;}
    public void setGood(GoodASO good) {this.good = good;}
    public InstallmentPlanASO getInstallmentPlan() {return installmentPlan;}
    public void setInstallmentPlan(InstallmentPlanASO installmentPlan) {this.installmentPlan = installmentPlan;}
    public AmountASO getTotalPremiumAmount() {return totalPremiumAmount;}
    public void setTotalPremiumAmount(AmountASO totalPremiumAmount) {this.totalPremiumAmount = totalPremiumAmount;}
    public HolderASO getHolder() {return holder;}
    public void setHolder(HolderASO holder) {this.holder = holder;}
    public String getChannel() {return channel;}
    public void setChannel(String channel) {this.channel = channel;}
    public String getOperationDate() {return operationDate;}
    public void setOperationDate(String operationDate) {this.operationDate = operationDate;}
    public String getOperationType() {return operationType;}
    public void setOperationType(String operationType) {this.operationType = operationType;}
    public BankASO getBank() {return bank;}
    public void setBank(BankASO bank) {this.bank = bank;}
    public QuotationASO getQuotation() {return quotation;}
    public void setQuotation(QuotationASO quotation) {this.quotation = quotation;}
    public BusinessAgentASO getBusinessAgent() {return businessAgent;}
    public void setBusinessAgent(BusinessAgentASO businessAgent) {this.businessAgent = businessAgent;}

    public ValidityPeriodASO getValidityPeriod() {return validityPeriod;}
    public void setValidityPeriod(ValidityPeriodASO validityPeriod) {this.validityPeriod = validityPeriod;}
    public InsuranceASO getInsurance() {return insurance;}
    public void setInsurance(InsuranceASO insurance) {this.insurance = insurance;}
    public String getPolicyNumber() {return policyNumber;}
    public void setPolicyNumber(String policyNumber) {this.policyNumber = policyNumber;}
    //Fin Emision Gifole
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GifoleInsuranceRequestASO{");
        sb.append("product=").append(product);
        sb.append(", good=").append(good);
        sb.append(", installmentPlan=").append(installmentPlan);
        sb.append(", totalPremiumAmount=").append(totalPremiumAmount);
        sb.append(", holder=").append(holder);
        sb.append(", channel='").append(channel).append('\'');
        sb.append(", operationDate='").append(operationDate).append('\'');
        sb.append(", operationType='").append(operationType).append('\'');
        sb.append(", scheduleContact='").append(scheduleContact).append('\'');
        sb.append(", bank='").append(bank).append('\'');
        sb.append(", quotation='").append(quotation).append('\'');
        sb.append(", validityPeriod='").append(validityPeriod).append('\'');
        sb.append(", insurance='").append(insurance).append('\'');
        sb.append(", policyNumber='").append(policyNumber).append('\'');
        sb.append(", businessAgent='").append(businessAgent).append('\'');
        sb.append(", externalSimulationId='").append(externalSimulationId).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
