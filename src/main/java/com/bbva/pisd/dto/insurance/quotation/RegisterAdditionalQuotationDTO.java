package com.bbva.pisd.dto.insurance.quotation;

<<<<<<< HEAD
import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class RegisterAdditionalQuotationDTO extends CommonOutputFieldsDTO {

    private String quotationId;
=======
import com.bbva.pisd.dto.insurance.bo.RegisterAdditionalVehPayloadBO;

public class RegisterAdditionalQuotationDTO extends RegisterAdditionalVehPayloadBO {

>>>>>>> 050772f641110fb416ba577c75ddc9d9e6d61fc8
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

<<<<<<< HEAD
    public String getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAdditionalQuotationDTO{");
        sb.append("quotation-id= ").append(quotationId).append('\'');
=======
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAdditionalQuotationDTO{");
        sb.append("quotation-id= ").append(this.getCotizacion()).append('\'');
>>>>>>> 050772f641110fb416ba577c75ddc9d9e6d61fc8
        sb.append(", engineNumber='").append(engineVeh).append('\'');
        sb.append(", vehicleIdentificationNumber='").append(chassisVeh).append('\'');
        sb.append(", seats='").append(seatVeh).append('\'');
        sb.append(", bank=").append(this.getBank());
        sb.append('}');
        return sb.toString();
    }
}
