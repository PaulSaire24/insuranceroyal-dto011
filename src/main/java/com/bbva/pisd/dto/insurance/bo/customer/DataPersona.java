package com.bbva.pisd.dto.insurance.bo.customer;

import com.bbva.pisd.dto.insurance.bo.CommonOutputFieldsBO;

public class DataPersona extends CommonOutputFieldsBO {

    private Persona persona;

    public Persona getPersona() { return persona; }
    public void setPersona(Persona persona) { this.persona = persona; }
}
