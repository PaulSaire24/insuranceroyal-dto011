package com.bbva.pisd.dto.insurance.bo.customer;

import com.bbva.pisd.dto.insurance.bo.CommonOutputFieldsBO;

import java.util.List;

public class DataPersona extends CommonOutputFieldsBO {

    private List<Persona> persona;

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }
}
