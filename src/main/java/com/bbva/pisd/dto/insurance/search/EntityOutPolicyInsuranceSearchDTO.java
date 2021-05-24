package com.bbva.pisd.dto.insurance.search;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class EntityOutPolicyInsuranceSearchDTO  extends AbstractDTO {

    private List<PolicyInsuranceSearchDTO> data;

    public List<PolicyInsuranceSearchDTO> getData() { return data; }

    public void setData(List<PolicyInsuranceSearchDTO> data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntityOutPolicyInsuranceSearchDTO{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
