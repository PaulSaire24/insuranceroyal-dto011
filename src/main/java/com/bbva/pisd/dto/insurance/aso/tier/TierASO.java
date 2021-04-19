package com.bbva.pisd.dto.insurance.aso.tier;

import java.util.List;

public class TierASO {

    private List<TierDataASO> data;

    public List<TierDataASO> getData() { return data; }
    public void setData(List<TierDataASO> data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TierASO{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
