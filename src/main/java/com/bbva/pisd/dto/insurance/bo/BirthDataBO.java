package com.bbva.pisd.dto.insurance.bo;

public class BirthDataBO {

    private CountryBO country;
    private String birthDate;

    public CountryBO getCountry() { return country; }
    public void setCountry(CountryBO country) { this.country = country; }
    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BirthDataBO{");
        sb.append("country=").append(country);
        sb.append(", birthDate='").append(birthDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
