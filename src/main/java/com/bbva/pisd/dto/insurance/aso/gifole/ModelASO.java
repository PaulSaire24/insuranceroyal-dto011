package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class ModelASO extends CommonFieldsASO {

    private BrandASO brand;
    private Long year;

    public BrandASO getBrand() {return brand;}
    public void setBrand(BrandASO brand) {this.brand = brand;}
    public Long getYear() {return year;}
    public void setYear(Long year) {this.year = year;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ModelASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", year=").append(year);
        sb.append(", brand=").append(brand);
        sb.append('}');
        return sb.toString();
    }
}
