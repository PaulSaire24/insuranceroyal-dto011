package com.bbva.pisd.dto.insurance.bo;

public class PlanesBO {

    private Long plan;

    public Long getPlan() { return plan; }
    public void setPlan(Long plan) { this.plan = plan; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanesBO{");
        sb.append("plan=").append(plan);
        sb.append('}');
        return sb.toString();
    }

}
