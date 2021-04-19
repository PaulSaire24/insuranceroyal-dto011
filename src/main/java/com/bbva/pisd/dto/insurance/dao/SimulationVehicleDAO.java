package com.bbva.pisd.dto.insurance.dao;

import java.math.BigDecimal;

public class SimulationVehicleDAO extends CommonsDAO {

    private String vehicleBrandId;
    private String vehicleBrandName;
    private String vehicleModelId;
    private String vehicleModelName;
    private String vehicleYearId;
    private BigDecimal commercialVehicleAmount;
    private String currencyId;
    private String newVehicleIndType;
    private String vehicleCirculationScopeType;
    private String vehChangeRudderIndType;
    private String vehicleGasConversionType;
    private String vehicleUseType;
    private String vehicleUsageDesc;
    private String vehicleLicenseId;

    public SimulationVehicleDAO() {
        this.vehChangeRudderIndType = "N";
        this.vehicleUseType = "P";
        this.vehicleUsageDesc = "Particular";
    }

    public String getVehicleBrandId() { return vehicleBrandId; }
    public void setVehicleBrandId(String vehicleBrandId) { this.vehicleBrandId = vehicleBrandId; }
    public String getVehicleBrandName() { return vehicleBrandName; }
    public void setVehicleBrandName(String vehicleBrandName) { this.vehicleBrandName = vehicleBrandName; }
    public String getVehicleModelId() { return vehicleModelId; }
    public void setVehicleModelId(String vehicleModelId) { this.vehicleModelId = vehicleModelId; }
    public String getVehicleModelName() { return vehicleModelName; }
    public void setVehicleModelName(String vehicleModelName) { this.vehicleModelName = vehicleModelName; }
    public String getVehicleYearId() { return vehicleYearId; }
    public void setVehicleYearId(String vehicleYearId) { this.vehicleYearId = vehicleYearId; }
    public BigDecimal getCommercialVehicleAmount() { return commercialVehicleAmount; }
    public void setCommercialVehicleAmount(BigDecimal commercialVehicleAmount) { this.commercialVehicleAmount = commercialVehicleAmount; }
    public String getCurrencyId() { return currencyId; }
    public void setCurrencyId(String currencyId) { this.currencyId = currencyId; }
    public String getNewVehicleIndType() { return newVehicleIndType; }
    public void setNewVehicleIndType(String newVehicleIndType) { this.newVehicleIndType = newVehicleIndType; }
    public String getVehicleCirculationScopeType() { return vehicleCirculationScopeType; }
    public void setVehicleCirculationScopeType(String vehicleCirculationScopeType) { this.vehicleCirculationScopeType = vehicleCirculationScopeType; }
    public String getVehChangeRudderIndType() { return vehChangeRudderIndType; }
    public void setVehChangeRudderIndType(String vehChangeRudderIndType) { this.vehChangeRudderIndType = vehChangeRudderIndType; }
    public String getVehicleGasConversionType() { return vehicleGasConversionType; }
    public void setVehicleGasConversionType(String vehicleGasConversionType) { this.vehicleGasConversionType = vehicleGasConversionType; }
    public String getVehicleUseType() { return vehicleUseType; }
    public void setVehicleUseType(String vehicleUseType) { this.vehicleUseType = vehicleUseType; }
    public String getVehicleUsageDesc() { return vehicleUsageDesc; }
    public void setVehicleUsageDesc(String vehicleUsageDesc) { this.vehicleUsageDesc = vehicleUsageDesc; }
    public String getVehicleLicenseId() { return vehicleLicenseId; }
    public void setVehicleLicenseId(String vehicleLicenseId) { this.vehicleLicenseId = vehicleLicenseId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimulationVehicleDAO{");
        sb.append("insuranceSimulationId=").append(this.getInsuranceSimulationId());
        sb.append(", insuranceProductId=").append(this.getInsuranceProductId());
        sb.append(", vehicleBrandId='").append(vehicleBrandId).append('\'');
        sb.append(", vehicleBrandName='").append(vehicleBrandName).append('\'');
        sb.append(", vehicleModelId='").append(vehicleModelId).append('\'');
        sb.append(", vehicleModelName='").append(vehicleModelName).append('\'');
        sb.append(", vehicleYearId='").append(vehicleYearId).append('\'');
        sb.append(", commercialVehicleAmount=").append(commercialVehicleAmount);
        sb.append(", currencyId='").append(currencyId).append('\'');
        sb.append(", newVehicleIndType='").append(newVehicleIndType).append('\'');
        sb.append(", vehicleCirculationScopeType='").append(vehicleCirculationScopeType).append('\'');
        sb.append(", vehChangeRudderIndType='").append(vehChangeRudderIndType).append('\'');
        sb.append(", vehicleGasConversionType='").append(vehicleGasConversionType).append('\'');
        sb.append(", vehicleUseType='").append(vehicleUseType).append('\'');
        sb.append(", vehicleUsageDesc='").append(vehicleUsageDesc).append('\'');
        sb.append(", vehicleLicenseId='").append(vehicleLicenseId).append('\'');
        sb.append(", creationUser='").append(this.getCreationUser()).append('\'');
        sb.append(", userAudit='").append(this.getUserAudit()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
