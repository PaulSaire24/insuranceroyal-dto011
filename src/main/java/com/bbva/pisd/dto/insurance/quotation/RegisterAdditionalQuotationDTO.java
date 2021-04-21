package com.bbva.pisd.dto.insurance.quotation;

import com.bbva.pisd.dto.insurance.bo.RegisterAdditionalVehPayloadBO;

public class RegisterAdditionalQuotationDTO extends RegisterAdditionalVehPayloadBO {

    private String chassisVeh;
    private String engineVeh;
    private Long seatVeh;


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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAdditionalQuotationDTO{");
        sb.append("quotation-id= ").append(this.getCotizacion()).append('\'');
        sb.append(", engineNumber='").append(engineVeh).append('\'');
        sb.append(", vehicleIdentificationNumber='").append(chassisVeh).append('\'');
        sb.append(", seats='").append(seatVeh).append('\'');
        sb.append(", bank=").append(this.getBank());
        sb.append('}');
        return sb.toString();
    }
}
