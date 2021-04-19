package com.bbva.pisd.dto.insurance.simulation;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class InsuranceSimulationDTO extends CommonOutputFieldsDTO {

    private String hasAcceptedDataTreatment;
    private String vehicleLicencePlate;

    private String simulationCompanyId;


    public String getHasAcceptedDataTreatment() { return hasAcceptedDataTreatment; }
    public void setHasAcceptedDataTreatment(String hasAcceptedDataTreatment) { this.hasAcceptedDataTreatment = hasAcceptedDataTreatment; }
    public String getVehicleLicencePlate() { return vehicleLicencePlate; }
    public void setVehicleLicencePlate(String vehicleLicencePlate) { this.vehicleLicencePlate = vehicleLicencePlate; }
    public String getSimulationCompanyId() { return simulationCompanyId; }
    public void setSimulationCompanyId(String simulationCompanyId) { this.simulationCompanyId = simulationCompanyId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSimulationDTO{");
        sb.append("holder=").append(this.getHolder());
        sb.append(", product=").append(this.getProduct());
        sb.append(", model=").append(this.getModel());
        sb.append(", price=").append(this.getPrice());
        sb.append(", vehicleCirculation=").append(this.getVehicleCirculation());
        sb.append(", hasPowerSupplyConvertion='").append(this.getHasPowerSupplyConvertion()).append('\'');
        sb.append(", usageType=").append(this.getUsageType());
        sb.append(", hasSteeringWheelChanged='").append(this.getHasSteeringWheelChanged()).append('\'');
        sb.append(", tier=").append(this.getTier());
        sb.append(", bankingFactor=").append(this.getBankingFactor());
        sb.append(", campaignFactor=").append(this.getCampaignFactor());

        sb.append(", validityDays=").append(this.getValidityDays());
        sb.append(", maturityDate=").append(this.getMaturityDate());
        sb.append(", isGpsRequired='").append(this.getIsGpsRequired()).append('\'');
        sb.append(", isInspectionRequired='").append(this.getIsInspectionRequired()).append('\'');

        sb.append(", hasAcceptedDataTreatment='").append(hasAcceptedDataTreatment).append('\'');
        sb.append(", vehicleLicencePlate='").append(vehicleLicencePlate).append('\'');
        sb.append(", simulationCompanyId='").append(simulationCompanyId).append('\'');
        sb.append(", bank=").append(this.getBank());
        sb.append('}');
        return sb.toString();
    }

}
