package com.bbva.pisd.dto.insurance.dao;

import java.math.BigDecimal;

public class InsuranceQuotationVehDAO extends CommonsDAO {

    private String requiredInspectionIndType;
    private String gpsIndType;
    private String chassisId;
    private String vehicleEngineId;
    private BigDecimal vehicleSeatNumber;

    public String getRequiredInspectionIndType() { return requiredInspectionIndType; }
    public void setRequiredInspectionIndType(String requiredInspectionIndType) { this.requiredInspectionIndType = requiredInspectionIndType; }
    public String getGpsIndType() { return gpsIndType; }
    public void setGpsIndType(String gpsIndType) { this.gpsIndType = gpsIndType; }
    public String getChassisId() { return chassisId; }
    public void setChassisId(String chassisId) { this.chassisId = chassisId; }
    public String getVehicleEngineId() { return vehicleEngineId; }
    public void setVehicleEngineId(String vehicleEngineId) { this.vehicleEngineId = vehicleEngineId; }
    public BigDecimal getVehicleSeatNumber() { return vehicleSeatNumber; }
    public void setVehicleSeatNumber(BigDecimal vehicleSeatNumber) { this.vehicleSeatNumber = vehicleSeatNumber; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceQuotationVehDAO{");
        sb.append("policyQuotaInternalId='").append(this.getPolicyQuotaInternalId()).append('\'');
        sb.append(", insuranceProductId=").append(this.getInsuranceProductId());
        sb.append(", insuranceModalityType='").append(this.getInsuranceModalityType()).append('\'');
        sb.append(", requiredInspectionIndType='").append(requiredInspectionIndType).append('\'');
        sb.append(", gpsIndType='").append(gpsIndType).append('\'');
        sb.append(", chassisId='").append(chassisId).append('\'');
        sb.append(", vehicleEngineId='").append(vehicleEngineId).append('\'');
        sb.append(", vehicleSeatNumber=").append(vehicleSeatNumber);
        sb.append(", creationUser='").append(this.getCreationUser()).append('\'');
        sb.append(", userAudit='").append(this.getUserAudit()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
