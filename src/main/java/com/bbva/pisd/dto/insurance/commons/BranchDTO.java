package com.bbva.pisd.dto.insurance.commons;

public class BranchDTO extends CommonDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BranchDTO{");
        sb.append("id='").append(this.getId());
        sb.append('}');
        return sb.toString();
    }

}
