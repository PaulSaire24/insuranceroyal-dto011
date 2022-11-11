package com.bbva.pisd.dto.insurance.commons;

import java.util.List;

public class ProductDTO extends CommonDTO{

    private List<PlansDTO> plans;

    public List<PlansDTO> getPlans() {
        return plans;
    }

    public void setPlans(List<PlansDTO> plans) {
        this.plans = plans;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductDTO{");
        sb.append("plans=").append(plans);
        sb.append('}');
        return sb.toString();
    }
}
