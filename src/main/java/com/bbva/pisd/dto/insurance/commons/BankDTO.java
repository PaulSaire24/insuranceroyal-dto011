package com.bbva.pisd.dto.insurance.commons;

public class BankDTO extends CommonDTO {

    private BranchDTO branch;

    public BranchDTO getBranch() { return branch; }
    public void setBranch(BranchDTO branch) { this.branch = branch; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", branch=").append(branch);
        sb.append('}');
        return sb.toString();
    }

}
