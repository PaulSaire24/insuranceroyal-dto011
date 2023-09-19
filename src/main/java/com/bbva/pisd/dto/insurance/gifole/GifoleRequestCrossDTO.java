package com.bbva.pisd.dto.insurance.gifole;

import com.bbva.pisd.dto.insurance.aso.gifole.QuotationASO;
import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.simulation.GifoleInternalSimulationDTO;
import com.bbva.pisd.dto.insurance.simulation.SimulationCompanyDTO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GifoleRequestCrossDTO extends CommonOutputFieldsDTO {

    private SimulationCompanyDTO simulationCompany;
    private String typeSimulation;
    private transient QuotationASO quotation;


    public QuotationASO getQuotation() {
        return quotation;
    }

    public void setQuotation(QuotationASO quotation) {
        this.quotation = quotation;
    }


    public SimulationCompanyDTO getSimulationCompany() { return simulationCompany; }
    public void setSimulationCompany(SimulationCompanyDTO simulationCompany) { this.simulationCompany = simulationCompany; }


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

        sb.append(", hasAcceptedDataTreatment='").append(this.getHasAcceptedDataTreatment()).append('\'');
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
