package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class BankASO extends CommonFieldsASO{

    private BranchASO branch;

    public BranchASO getBranch() {return branch;}
    public void setBranch(BranchASO branch) {this.branch = branch;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append("branch='").append(branch).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
