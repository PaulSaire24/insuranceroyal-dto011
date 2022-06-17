package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class SearchQuotationPaginationBO extends CommonOutputFieldsBO {

    private List<SearchPayloadBO> cotizaciones;
    private String indPaginacion;

    public List<SearchPayloadBO> getCotizaciones() { return cotizaciones; }
    public void setCotizaciones(List<SearchPayloadBO> cotizaciones) { this.cotizaciones = cotizaciones; }
    public String getIndPaginacion() { return indPaginacion; }
    public void setIndPaginacion(String indPaginacion) { this.indPaginacion = indPaginacion; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchQuotationPaginationBO{");
        sb.append("cotizaciones=").append(cotizaciones);
        sb.append("indPaginacion=").append(indPaginacion);
        sb.append(", error=").append(this.getError());
        sb.append('}');
        return sb.toString();
    }

}
