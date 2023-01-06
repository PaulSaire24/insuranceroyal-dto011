package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AseguradoBO extends CommonOutputFieldsBO {
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AseguradoBO{");
        sb.append("tipoDocumento='").append(this.getTipoDocumento()).append('\'');
        sb.append(", numeroDocumento='").append(this.getNumeroDocumento()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
