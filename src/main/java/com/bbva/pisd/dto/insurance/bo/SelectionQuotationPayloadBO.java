package com.bbva.pisd.dto.insurance.bo;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectionQuotationPayloadBO {

    private List<PlanesBO> planes;
    private AseguradoBO asegurado;
    private String codigoExterno;
    private String status;
    private String mensaje;

    public List<PlanesBO> getPlanes() { return planes; }
    public void setPlanes(List<PlanesBO> planes) { this.planes = planes; }
    public AseguradoBO getAsegurado() { return asegurado; }
    public void setAsegurado(AseguradoBO asegurado) { this.asegurado = asegurado; }
    public String getCodigoExterno() { return codigoExterno; }
    public void setCodigoExterno(String codigoExterno) { this.codigoExterno = codigoExterno; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SeleccionPayloadBO{");
        sb.append("planes=").append(planes);
        sb.append(", asegurado=").append(asegurado);
        sb.append(", codigoExterno='").append(codigoExterno).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
