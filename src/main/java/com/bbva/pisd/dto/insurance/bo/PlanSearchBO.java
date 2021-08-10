package com.bbva.pisd.dto.insurance.bo;

public class PlanSearchBO extends CommonBO {

    private Integer plan;
    private String dscPlan;
    private String ideProd;
    private String dscProd;

    public Integer getPlan() {
        return plan;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    public String getDscPlan() {
        return dscPlan;
    }

    public void setDscPlan(String dscPlan) {
        this.dscPlan = dscPlan;
    }

    public String getIdeProd() { return ideProd; }

    public void setIdeProd(String ideProd) { this.ideProd = ideProd; }

    public String getDscProd() { return dscProd; }

    public void setDscProd(String dscProd) { this.dscProd = dscProd; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanSearchBO{");
        sb.append("plan=").append(plan);
        sb.append(", dscPlan='").append(dscPlan).append('\'');
        sb.append(", ideProd='").append(ideProd).append('\'');
        sb.append(", dscProd='").append(dscProd).append('\'');
        sb.append("primaBruta=").append(this.getPrimaBruta());
        sb.append(", primaNeta=").append(this.getPrimaNeta());
        sb.append(", moneda='").append(this.getMoneda()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
