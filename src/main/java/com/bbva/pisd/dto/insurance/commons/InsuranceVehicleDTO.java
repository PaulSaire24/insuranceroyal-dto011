package com.bbva.pisd.dto.insurance.commons;


public class InsuranceVehicleDTO extends CommonOutputFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VehicleDTO{");
        sb.append(", licensePlate='").append(this.getLicensePlate()).append('\'');
        sb.append("model=").append(this.getModel());
        sb.append(", price=").append(this.getPrice());
        sb.append(", engineNumber='").append(this.getEngineNumber()).append('\'');
        sb.append(", vehicleIdentificationNumber='").append(this.getVehicleIdentificationNumber()).append('\'');
        sb.append(", seats='").append(this.getSeats()).append('\'');
        sb.append(", hasSteeringWheelChanged='").append(this.getHasSteeringWheelChanged()).append('\'');
        sb.append(", hasPowerSupplyConvertion='").append(this.getHasPowerSupplyConvertion()).append('\'');
        return sb.toString();
    }

}
