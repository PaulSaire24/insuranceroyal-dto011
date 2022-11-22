package com.bbva.pisd.dto.insurance.commons;

public class UninsurableGoodsDTO extends CommonDTO{

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UninsurableGoodsDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", isPrincipal='").append(this.getPrincipal()).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
