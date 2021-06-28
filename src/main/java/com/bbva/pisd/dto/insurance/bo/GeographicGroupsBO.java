package com.bbva.pisd.dto.insurance.bo;

public class GeographicGroupsBO extends CommonBO {

    private GeographicGroupTypeBO geographicGroupType;
    private String code;

    public GeographicGroupTypeBO getGeographicGroupType() { return geographicGroupType; }
    public void setGeographicGroupType(GeographicGroupTypeBO geographicGroupType) { this.geographicGroupType = geographicGroupType; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeographicGroupsBO{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", geographicGroupType=").append(geographicGroupType);
        sb.append('}');
        return sb.toString();
    }
}
