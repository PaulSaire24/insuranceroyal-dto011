package com.bbva.pisd.dto.insurance.quotation;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class RegisterAdditionalQuotationDTO extends CommonOutputFieldsDTO {

    private String chassisVeh;
    private String engineVeh;
    private Long seatVeh;

    public Long getSeatVeh() { return seatVeh; }
    public void setSeatVeh(Long seatVeh) { this.seatVeh = seatVeh; }
    public String getChassisVeh() { return chassisVeh; }
    public void setChassisVeh(String chassisVeh) { this.chassisVeh = chassisVeh; }
    public String getEngineVeh() { return engineVeh; }
    public void setEngineVeh(String engineVeh) { this.engineVeh = engineVeh; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAdditionalQuotationDTO{");
        sb.append("quotationId='").append(this.getQuotationId()).append('\'');
        sb.append(", engineVeh='").append(engineVeh).append('\'');
        sb.append(", chassisVeh='").append(chassisVeh).append('\'');
        sb.append(", seatVeh='").append(seatVeh).append('\'');
        sb.append(", bank=").append(getBank());
        sb.append('}');
        return sb.toString();
    }
}
