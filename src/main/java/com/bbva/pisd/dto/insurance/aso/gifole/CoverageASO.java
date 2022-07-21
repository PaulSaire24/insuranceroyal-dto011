package com.bbva.pisd.dto.insurance.aso.gifole;

import java.util.List;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class CoverageASO extends CommonFieldsASO{

    private List<CoverageFeeASO> coverageFees;

    public List<CoverageFeeASO> getCoverageFees() {return coverageFees;}
    public void setCoverageFees(List<CoverageFeeASO> coverageFees) {this.coverageFees = coverageFees;}
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageASO{");
        sb.append("coverageFees=").append(coverageFees);
        sb.append("id=").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
