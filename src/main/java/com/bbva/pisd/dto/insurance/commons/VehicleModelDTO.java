package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class VehicleModelDTO extends AbstractDTO {

    private String id;
    private String name;
    private Long year;
    private VehicleBrandDTO brand;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getYear() { return year; }
    public void setYear(Long year) { this.year = year; }
    public VehicleBrandDTO getBrand() { return brand; }
    public void setBrand(VehicleBrandDTO brand) { this.brand = brand; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VehicleModelDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", year=").append(year);
        sb.append(", brand=").append(brand);
        sb.append('}');
        return sb.toString();
    }

}
