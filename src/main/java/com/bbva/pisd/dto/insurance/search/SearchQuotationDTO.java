package com.bbva.pisd.dto.insurance.search;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.simulation.VehicleDTO;

public class SearchQuotationDTO extends CommonOutputFieldsDTO {

    private VehicleDTO vehicle;

    public VehicleDTO getVehicle() { return vehicle; }
    public void setVehicle(VehicleDTO vehicle) { this.vehicle = vehicle; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchQuotationDTO{");
        sb.append("holder=").append(this.getHolder());
        sb.append(", licensePlate='").append(this.getLicensePlate()).append('\'');
        sb.append(", id='").append(this.getId()).append('\'');
        sb.append(", operationDate=").append(this.getOperationDate()).append('\'');;
        sb.append(", maturityDate=").append(this.getMaturityDate()).append('\'');;
        sb.append(", product=").append(this.getProduct()).append('\'');;
        sb.append(", status=").append(this.getStatus()).append('\'');;
        sb.append(", model=").append(this.getModel()).append('\'');;
        sb.append(", vehicle=").append(vehicle).append('\'');;
        sb.append('}');
        return sb.toString();
    }

}
