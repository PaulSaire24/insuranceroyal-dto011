package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class LocationBO extends CommonOutputFieldsBO {

    private CountryBO country;
    private String additionalInformation;
    private List<GeographicGroupsBO> geographicGroups;

    public CountryBO getCountry() { return country; }
    public void setCountry(CountryBO country) { this.country = country; }
    public String getAdditionalInformation() { return additionalInformation; }
    public void setAdditionalInformation(String additionalInformation) { this.additionalInformation = additionalInformation; }
    public List<GeographicGroupsBO> getGeographicGroups() { return geographicGroups; }
    public void setGeographicGroups(List<GeographicGroupsBO> geographicGroups) { this.geographicGroups = geographicGroups; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocationBO{");
        sb.append("country=").append(country);
        sb.append(", additionalInformation=").append(additionalInformation);
        sb.append(", geographicGroups=").append(geographicGroups);
        sb.append(", state=").append(this.getState());
        sb.append("country=").append(country);
        sb.append('}');
        return sb.toString();
    }
}
