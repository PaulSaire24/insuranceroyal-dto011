package com.bbva.pisd.dto.insurance.gifole;

import com.bbva.pisd.dto.insurance.aso.gifole.QuotationASO;
import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.simulation.GifoleInternalSimulationDTO;
import com.bbva.pisd.dto.insurance.simulation.SimulationCompanyDTO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GifoleRequestCrossDTO extends CommonOutputFieldsDTO {

    private String hasAcceptedDataTreatment;

    private Boolean isDataTreatment;

    private SimulationCompanyDTO simulationCompany;
    private GifoleInternalSimulationDTO gifoleInternalSimulation;
    private String typeSimulation;

    private Boolean isBankCustomer;

    private Boolean hasCreditCard;

    private String operationType;

    private String policyNumber;

    private String channelCode;

    private transient QuotationASO quotation;


    private Boolean hasBankAccount;

    public Boolean getHasBankAccount() {
        return hasBankAccount;
    }

    public void setHasBankAccount(Boolean hasBankAccount) {
        this.hasBankAccount = hasBankAccount;
    }

    public QuotationASO getQuotation() {
        return quotation;
    }

    public void setQuotation(QuotationASO quotation) {
        this.quotation = quotation;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Boolean getHasCreditCard() {
        return hasCreditCard;
    }

    public void setHasCreditCard(Boolean hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }

    public Boolean getIsBankCustomer() {
        return isBankCustomer;
    }

    public void setIsBankCustomer(Boolean bankCustomer) {
        isBankCustomer = bankCustomer;
    }

    public Boolean getIsDataTreatment() {
        return isDataTreatment;
    }

    public void setIsDataTreatment(Boolean dataTreatment) {
        isDataTreatment = dataTreatment;
    }

    public String getHasAcceptedDataTreatment() { return hasAcceptedDataTreatment; }
    public void setHasAcceptedDataTreatment(String hasAcceptedDataTreatment) { this.hasAcceptedDataTreatment = hasAcceptedDataTreatment; }
    public SimulationCompanyDTO getSimulationCompany() { return simulationCompany; }
    public void setSimulationCompany(SimulationCompanyDTO simulationCompany) { this.simulationCompany = simulationCompany; }

    public GifoleInternalSimulationDTO getGifoleInternalSimulation() {
        return gifoleInternalSimulation;
    }

    public void setGifoleInternalSimulation(GifoleInternalSimulationDTO gifoleInternalSimulation) {
        this.gifoleInternalSimulation = gifoleInternalSimulation;
    }

    public String getTypeSimulation() {
        return typeSimulation;
    }

    public void setTypeSimulation(String typeSimulation) {
        this.typeSimulation = typeSimulation;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GifoleRequestCrossDTO{");
        sb.append("holder=").append(this.getHolder());
        sb.append(", product=").append(this.getProduct());
        sb.append(", vehicle=").append(this.getVehicle());
        sb.append(", vehicleCirculation=").append(this.getVehicleCirculation());
        sb.append(", usageType=").append(this.getUsageType());
        sb.append(", tier=").append(this.getTier());
        sb.append(", bankingFactor=").append(this.getBankingFactor());
        sb.append(", campaignFactor=").append(this.getCampaignFactor());

        sb.append(", validityDays=").append(this.getValidityDays());
        sb.append(", maturityDate=").append(this.getMaturityDate());
        sb.append(", isGpsRequired='").append(this.getIsGpsRequired()).append('\'');
        sb.append(", isInspectionRequired='").append(this.getIsInspectionRequired()).append('\'');

        sb.append(", hasAcceptedDataTreatment='").append(hasAcceptedDataTreatment).append('\'');
        sb.append(", simulationCompany='").append(this.getSimulationCompany());
        sb.append(", bank=").append(this.getBank());
        sb.append(", isEndorseRequired=").append(this.getEndorseRequired());
        sb.append(", simulationInternal=").append(this.getGifoleInternalSimulation());
        sb.append(", typeSimulation=").append(this.getTypeSimulation());
        sb.append(", operationType=").append(this.getOperationType());
        sb.append(", channelCode=").append(this.getChannelCode());
        sb.append('}');
        return sb.toString();
    }

}
