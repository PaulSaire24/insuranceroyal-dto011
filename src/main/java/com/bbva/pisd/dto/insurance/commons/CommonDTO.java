package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class CommonDTO extends AbstractDTO {

    private String id;
    private String name;
    private Boolean isPrincipal;
    @JsonProperty("isSelected")
    private Boolean isSelected;
    private CoverageCategoryDTO coverageCategory;
    private String number;
    private String description;
    private UnitDTO unit;
    private CoverageTypeDTO coverageType;
    private CoverageGroupDTO coverageGroup;
    private List<CoverageFeesDTO> coverageFees;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsPrincipal() { return isPrincipal; }
    public void setIsPrincipal(Boolean principal) { isPrincipal = principal; }


    @JsonProperty("isSelected")
    public Boolean getSelected() {
        return isSelected;
    }

    @JsonProperty("isSelected")
    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    public CoverageCategoryDTO getCoverageCategory() {
        return coverageCategory;
    }

    public void setCoverageCategory(CoverageCategoryDTO coverageCategory) {
        this.coverageCategory = coverageCategory;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UnitDTO getUnit() {
        return unit;
    }

    public void setUnit(UnitDTO unit) {
        this.unit = unit;
    }

    public CoverageTypeDTO getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(CoverageTypeDTO coverageType) {
        this.coverageType = coverageType;
    }

    public CoverageGroupDTO getCoverageGroup() {
        return coverageGroup;
    }

    public void setCoverageGroup(CoverageGroupDTO coverageGroup) {
        this.coverageGroup = coverageGroup;
    }

    public List<CoverageFeesDTO> getCoverageFees() {
        return coverageFees;
    }

    public void setCoverageFees(List<CoverageFeesDTO> coverageFees) {
        this.coverageFees = coverageFees;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommonDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", isPrincipal=").append(isPrincipal);
        sb.append(", isSelected=").append(isSelected);
        sb.append(", coverageCategory=").append(coverageCategory);
        sb.append(", number='").append(number).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unit=").append(unit);
        sb.append(", coverageType=").append(coverageType);
        sb.append(", coverageGroup=").append(coverageGroup);
        sb.append(", coverageFees=").append(coverageFees);
        sb.append('}');
        return sb.toString();
    }
}