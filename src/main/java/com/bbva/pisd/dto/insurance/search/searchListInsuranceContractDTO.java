package com.bbva.pisd.dto.insurance.search;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.LinkDTO;

import java.util.List;

public class searchListInsuranceContractDTO extends CommonOutputFieldsDTO {

    private List<LinkDTO> link;

    public List<LinkDTO> getLink() { return link; }
    public void setLink(List<LinkDTO> link) { this.link = link;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("searchListInsuranceContractDTO{");
        sb.append("link=").append(link);
        sb.append('}');
        return sb.toString();
    }

}
