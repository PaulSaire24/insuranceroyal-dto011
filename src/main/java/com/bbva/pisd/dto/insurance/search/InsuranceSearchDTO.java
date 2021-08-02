package com.bbva.pisd.dto.insurance.search;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.IdentityDocumentDTO;
import com.bbva.pisd.dto.insurance.simulation.VehicleDTO;

public class InsuranceSearchDTO extends CommonOutputFieldsDTO {

    private IdentityDocumentDTO document;
    private VehicleDTO vehicle;
    private String traceId;

    public IdentityDocumentDTO getDocument() { return document; }
    public void setDocument(IdentityDocumentDTO document) { this.document = document; }
    public VehicleDTO getVehicle() { return vehicle; }
    public void setVehicle(VehicleDTO vehicle) { this.vehicle = vehicle; }
    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceSearchDTO{");
        sb.append("document=").append(document);
        sb.append(", vehicle='").append(vehicle).append('\'');
        sb.append(", traceId='").append(traceId).append('\'');
        sb.append(", product='").append(this.getProduct()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
