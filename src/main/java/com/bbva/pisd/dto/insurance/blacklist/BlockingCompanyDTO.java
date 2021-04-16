package com.bbva.pisd.dto.insurance.blacklist;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class BlockingCompanyDTO extends CommonDTO {
	public BlockingCompanyDTO(String id) { this.setId(id); }
	
	public BlockingCompanyDTO() { }
	
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BlockingCompanyDTO{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
