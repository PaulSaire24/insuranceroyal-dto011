package com.bbva.pisd.dto.insurance.quotation;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class RegisterAdditionalQuotationDTO extends CommonOutputFieldsDTO {

    private String quotationId;
    private String chassisVeh;
    private String engineVeh;
    private Long seatVeh;
    private String lastChangeBranchId;


    public Long getSeatVeh() {
        return seatVeh;
    }

    public void setSeatVeh(Long seatVeh) {
        this.seatVeh = seatVeh;
    }


    public String getChassisVeh() {
        return chassisVeh;
    }

    public void setChassisVeh(String chassisVeh) {
        this.chassisVeh = chassisVeh;
    }

    public String getEngineVeh() {
        return engineVeh;
    }

    public void setEngineVeh(String engineVeh) {
        this.engineVeh = engineVeh;
    }

    public String getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }

    public String getLastChangeBranchId() {
        return lastChangeBranchId;
    }

    public void setLastChangeBranchId(String lastChangeBranchId) {
        this.lastChangeBranchId = lastChangeBranchId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAdditionalQuotationDTO{");
         sb.append("quotation-id='").append(quotationId).append('\'');
        sb.append(", engineNumber='").append(engineVeh).append('\'');
        sb.append(", vehicleIdentificationNumber='").append(chassisVeh).append('\'');
        sb.append(", seats='").append(seatVeh).append('\'');
        sb.append(", bank='").append(lastChangeBranchId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
