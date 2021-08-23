package com.bbva.pisd.dto.insurance.simulation;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class VehicleDTO extends CommonOutputFieldsDTO {
    
    private boolean hasPowerSupplyConvertionBoolean;
    private boolean hasSteeringWheelChangedBoolean;


    public boolean getHasSteeringWheelChangedBoolean() {return this.hasSteeringWheelChangedBoolean;}
    public void setHasSteeringWheelChangedBoolean(boolean hasSteeringWheelChangedBoolean) {this.hasSteeringWheelChangedBoolean = hasSteeringWheelChangedBoolean;}

    public boolean getHasPowerSupplyConvertionBoolean() {return this.hasPowerSupplyConvertionBoolean;}
    public void setHasPowerSupplyConvertionBoolean(boolean hasPowerSupplyConvertionBoolean) {this.hasPowerSupplyConvertionBoolean = hasPowerSupplyConvertionBoolean;}
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VehicleDTO{");
        sb.append("model=").append(this.getModel());
        sb.append(", price=").append(this.getPrice());
        sb.append(", hasPowerSupplyConvertion='").append(this.getHasPowerSupplyConvertion()).append('\'');
        sb.append(", licensePlate='").append(this.getLicensePlate()).append('\'');
        sb.append(", engineNumber='").append(this.getEngineNumber()).append('\'');
        sb.append(", vehicleIdentificationNumber='").append(this.getVehicleIdentificationNumber()).append('\'');
        sb.append(", seats='").append(this.getSeats()).append('\'');
        sb.append(", hasSteeringWheelChanged='").append(this.getHasSteeringWheelChanged()).append('\'');
        sb.append(", hasPowerSupplyConvertionBoolean='").append(hasPowerSupplyConvertionBoolean).append('\'');
        sb.append(", hasSteeringWheelChangedBoolean='").append(hasSteeringWheelChangedBoolean).append('\'');
        return sb.toString();
    }

}
