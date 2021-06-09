package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class RegisterAdditionalVehPayloadBO{

    private String cotizacion;
    private List<DatoParticularBO> datosParticulares;
    private String indPolizaElectronica;
    private String success;
    private String mensaje;

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public List<DatoParticularBO> getDatosParticulares() {
        return datosParticulares;
    }

    public void setDatosParticulares(List<DatoParticularBO> datosParticulares) { this.datosParticulares = datosParticulares; }

    public String getIndPolizaElectronica() {
        return indPolizaElectronica;
    }

    public void setIndPolizaElectronica(String indPolizaElectronica) { this.indPolizaElectronica = indPolizaElectronica; }

    public String getSuccess() { return success; }

    public void setSuccess(String success) { this.success = success; }

    public String getMensaje() { return mensaje; }

    public void setMensaje(String mensaje) { this.mensaje = mensaje; }



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
