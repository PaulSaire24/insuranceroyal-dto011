package com.bbva.pisd.dto.insurance.bo.customer;

import com.bbva.pisd.dto.insurance.bo.CommonOutputFieldsBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataPersona extends CommonOutputFieldsBO {

    private List<Persona> persona;

    public List<Persona> getPersona() {
        return persona;
    }
    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataPersona{");
        sb.append("persona=").append(persona);
        sb.append(", cotizacion='").append(this.getCotizacion()).append('\'');
        sb.append(", mensaje='").append(this.getMensaje()).append('\'');
        sb.append(", status='").append(this.getStatus()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
