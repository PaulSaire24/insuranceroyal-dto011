package com.bbva.pisd.dto.insurance.blacklist;

import com.bbva.pisd.dto.insurance.commons.CommonDTO;

public class BlackListTypeDTO extends CommonDTO {
	public BlackListTypeDTO(String id) {
		this.setId(id);
	}
	
	public BlackListTypeDTO() {
	}
	
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BlackListTypeDTO{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
