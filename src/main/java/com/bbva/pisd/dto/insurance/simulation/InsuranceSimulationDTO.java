package com.bbva.pisd.dto.insurance.simulation;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InsuranceSimulationDTO extends CommonOutputFieldsDTO {

    private String hasAcceptedDataTreatment;
    private SimulationCompanyDTO simulationCompany;
    private GifoleInternalSimulationDTO gifoleInternalSimulation;
    private String typeSimulation;

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
        final StringBuilder sb = new StringBuilder("InsuranceSimulationDTO{");
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
        sb.append('}');
        return sb.toString();
    }

}
