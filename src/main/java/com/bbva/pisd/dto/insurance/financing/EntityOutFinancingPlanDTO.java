package com.bbva.pisd.dto.insurance.financing;

import com.bbva.apx.dto.AbstractDTO;

public class EntityOutFinancingPlanDTO extends AbstractDTO {

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
