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
    //Inicio Open Market
    private ScheduleContactDTO scheduleContact;

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
        sb.append('}');
        return sb.toString();
    }

}
