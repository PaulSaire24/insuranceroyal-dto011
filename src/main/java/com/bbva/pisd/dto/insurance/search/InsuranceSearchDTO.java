package com.bbva.pisd.dto.insurance.search;


import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.IdentityDocumentDTO;
import com.bbva.pisd.dto.insurance.simulation.VehicleDTO;

public class InsuranceSearchDTO extends CommonOutputFieldsDTO {

    private IdentityDocumentDTO document;
    private VehicleDTO vehicle;

    public IdentityDocumentDTO getDocument() { return document; }
    public void setDocument(IdentityDocumentDTO document) { this.document = document; }
    public VehicleDTO getVehicle() { return vehicle; }
    public void setVehicle(VehicleDTO vehicle) { this.vehicle = vehicle; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSearchDTO{");
        sb.append("document=").append(document);
        sb.append(", vehicle='").append(vehicle).append('\'');
        sb.append(", product='").append(this.getProduct()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
