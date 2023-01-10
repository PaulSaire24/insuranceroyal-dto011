package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotationDetailPlanBO extends CommonOutputFieldsBO {

    private String plan;
    private String descripcionPlan;
    private List<FinanciamientoBO> financiamientos;
    private List<ComponenteBO> componente;
    private List<QuotationDetailDeducibleBO> deducible;
    private List<ClausulaBO> clausulas;
    private List<DatoParticularBO> datosParticulares;

    public String getPlan() { return plan; }
    public void setPlan(String plan) { this.plan = plan; }
    public String getDescripcionPlan() { return descripcionPlan; }
    public void setDescripcionPlan(String descripcionPlan) { this.descripcionPlan = descripcionPlan; }
    public List<FinanciamientoBO> getFinanciamientos() { return financiamientos; }
    public void setFinanciamientos(List<FinanciamientoBO> financiamientos) { this.financiamientos = financiamientos; }
    public List<ComponenteBO> getComponente() { return componente; }
    public void setComponente(List<ComponenteBO> componente) { this.componente = componente; }
    public List<QuotationDetailDeducibleBO> getDeducible() { return deducible; }
    public void setDeducible(List<QuotationDetailDeducibleBO> deducible) { this.deducible = deducible; }
    public List<ClausulaBO> getClausulas() { return clausulas; }
    public void setClausulas(List<ClausulaBO> clausulas) { this.clausulas = clausulas; }
    public List<DatoParticularBO> getDatosParticulares() { return datosParticulares; }
    public void setDatosParticulares(List<DatoParticularBO> datosParticulares) { this.datosParticulares = datosParticulares; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationDetailPlanBO{");
        sb.append("plan='").append(plan).append('\'');
        sb.append(", descripcionPlan='").append(descripcionPlan).append('\'');
        sb.append(", primaNeta=").append(this.getPrimaNeta());
        sb.append(", primaBruta=").append(this.getPrimaBruta());
        sb.append(", indicadorInspeccion='").append(this.getIndicadorInspeccion()).append('\'');
        sb.append(", financiamientos=").append(financiamientos);
        sb.append(", componente=").append(componente);
        sb.append(", deducible=").append(deducible);
        sb.append(", clausulas=").append(clausulas);
        sb.append(", datosParticulares=").append(datosParticulares);
        sb.append('}');
        return sb.toString();
    }

}
