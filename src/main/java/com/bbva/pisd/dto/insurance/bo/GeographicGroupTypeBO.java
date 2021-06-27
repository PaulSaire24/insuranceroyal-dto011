package com.bbva.pisd.dto.insurance.bo;

public class GeographicGroupTypeBO extends CommonBO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeographicGroupTypeBO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
