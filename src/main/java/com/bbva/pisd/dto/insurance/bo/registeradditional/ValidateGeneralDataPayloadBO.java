package com.bbva.pisd.dto.insurance.bo.registeradditional;

import java.util.List;

public class ValidateGeneralDataPayloadBO {

    private String indBloqueo;
    private List<GeneralDataObservationsBO> observaciones;

    public String getIndBloqueo() {return indBloqueo;}
    public void setIndBloqueo(String indBloqueo) {this.indBloqueo = indBloqueo;}
    public List<GeneralDataObservationsBO> getObservaciones() {return observaciones;}
    public void setObservaciones(List<GeneralDataObservationsBO> observaciones) {this.observaciones = observaciones;}

}