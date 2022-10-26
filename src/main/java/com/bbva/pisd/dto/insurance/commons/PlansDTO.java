package com.bbva.pisd.dto.insurance.commons;

import java.util.List;

public class PlansDTO extends CommonDTO{

    private transient List<CoveragesDTO> coverages;

    public List<CoveragesDTO> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<CoveragesDTO> coverages) {
        this.coverages = coverages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlansDTO{");
        sb.append("coverages=").append(coverages);
        sb.append('}');
        return sb.toString();
    }
}
