package com.bbva.pisd.dto.insurance.bo;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

import java.util.List;

<<<<<<< HEAD
public class RegisterAdditionalVehPayloadBO{
=======
public class RegisterAdditionalVehPayloadBO extends CommonOutputFieldsDTO {
>>>>>>> 050772f641110fb416ba577c75ddc9d9e6d61fc8

    private String cotizacion;
    private List<DatoParticularBO> datosParticulares;
    private String indPolizaElectronica;

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public List<DatoParticularBO> getDatosParticulares() {
        return datosParticulares;
    }

    public void setDatosParticulares(List<DatoParticularBO> datosParticulares) {
        this.datosParticulares = datosParticulares;
    }

    public String getIndPolizaElectronica() {
        return indPolizaElectronica;
    }

    public void setIndPolizaElectronica(String indPolizaElectronica) {
        this.indPolizaElectronica = indPolizaElectronica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAdditionalVehPayloadBO{");
        sb.append("cotizacion='").append(cotizacion).append('\'');
        sb.append("datosParticulares='").append(datosParticulares);
        sb.append("indPolizaElectronica='").append(indPolizaElectronica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
