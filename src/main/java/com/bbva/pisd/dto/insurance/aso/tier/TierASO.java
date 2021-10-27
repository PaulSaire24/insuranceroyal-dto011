package com.bbva.pisd.dto.insurance.aso.tier;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

import java.util.List;

public class TierASO extends CommonFieldsASO {

    private List<TierDataASO> data;

    public List<TierDataASO> getData() { return data; }
    public void setData(List<TierDataASO> data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TierASO{");
        sb.append("data=").append(data);
        sb.append(", id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
