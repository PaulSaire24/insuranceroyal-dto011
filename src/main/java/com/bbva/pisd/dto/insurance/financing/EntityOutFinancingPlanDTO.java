package com.bbva.pisd.dto.insurance.financing;

public class EntityOutFinancingPlanDTO {

    private FinancingPlanDTO data;

    public FinancingPlanDTO getData() { return data; }
    public void setData(FinancingPlanDTO data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntityOutFinancingPlanDTO{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
