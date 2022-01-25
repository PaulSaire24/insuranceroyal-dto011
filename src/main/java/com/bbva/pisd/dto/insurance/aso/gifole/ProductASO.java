package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class ProductASO extends CommonFieldsASO {

    private PlanASO plan;

    public PlanASO getPlan() {return plan;}
    public void setPlan(PlanASO plan) {this.plan = plan;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", plan=").append(plan);
        sb.append('}');
        return sb.toString();
    }

}
