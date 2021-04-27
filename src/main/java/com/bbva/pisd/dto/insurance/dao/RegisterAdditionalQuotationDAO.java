package com.bbva.pisd.dto.insurance.dao;

public class RegisterAdditionalQuotationDAO extends CommonsDAO{

    private String engineId;
    private Long seatNumber;
    private String chassisId;

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public Long getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Long seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getChassisId() {
        return chassisId;
    }

    public void setChassisId(String chassisId) {
        this.chassisId = chassisId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAdditionalQuotationDAO{");
        sb.append("policyQuotaInternalId='").append(this.getPolicyQuotaInternalId()).append('\'');
        sb.append(", chassisId=").append(chassisId).append('\'');
        sb.append(", vehicleEngineId='").append(engineId).append('\'');
        sb.append(", vehicleSeatNumber='").append(seatNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
