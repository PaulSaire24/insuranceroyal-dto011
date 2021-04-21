package com.bbva.pisd.dto.insurance.search;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class EntityOutSearchDTO extends AbstractDTO {

    private List<SearchQuotationDTO> data;

    public List<SearchQuotationDTO> getData() { return data; }
    public void setData(List<SearchQuotationDTO> data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntityOutSearchDTO{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }

}
