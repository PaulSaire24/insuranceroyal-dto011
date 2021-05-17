package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class CommonDTO extends AbstractDTO {

    private String id;
    private String name;
    private String number;
    private String description;
    private UnitDTO unit;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public UnitDTO getUnit() { return unit; }
    public void setUnit(UnitDTO unit) { this.unit = unit; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", unit=").append(unit);
        sb.append('}');
        return sb.toString();
    }
}