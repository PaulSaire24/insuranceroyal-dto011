package com.bbva.pisd.dto.insurance.bo;

public class PlanSearchBO extends CommonBO {

    private Integer plan;
    private String dscPlan;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanSearchBO{");
        sb.append("plan=").append(plan);
        sb.append(", dscPlan='").append(dscPlan).append('\'');
        sb.append("primaBruta=").append(this.getPrimaBruta());
        sb.append(", primaNeta=").append(this.getPrimaNeta());
        sb.append(", moneda='").append(this.getMoneda()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
