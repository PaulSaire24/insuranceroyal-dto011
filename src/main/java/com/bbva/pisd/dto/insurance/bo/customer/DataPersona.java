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
}
