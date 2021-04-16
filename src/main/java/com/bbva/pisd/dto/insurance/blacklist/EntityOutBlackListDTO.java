package com.bbva.pisd.dto.insurance.blacklist;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class EntityOutBlackListDTO extends AbstractDTO {

    private List<InsuranceBlackListDTO> data;

    public List<InsuranceBlackListDTO> getData() { return data; }
    public void setData(List<InsuranceBlackListDTO> data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntityOutBlackListDTO{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
