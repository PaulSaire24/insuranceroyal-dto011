package com.bbva.pisd.dto.insurance.commons;

import java.util.List;

public class InsuranceProductDTO extends CommonOutputFieldsDTO {

    private String name;
    private List<InsuranceProductModalityDTO> plans;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<InsuranceProductModalityDTO> getPlans() { return plans; }
    public void setPlans(List<InsuranceProductModalityDTO> plans) { this.plans = plans; }

    public InsuranceProductDTO(String id, String description, List<InsuranceProductModalityDTO> plans) {
		this.setId(id);
		this.setDescription(description);
		this.plans = plans;
	}
    
	public InsuranceProductDTO() { }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceProductDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append(", plans=").append(plans);
        sb.append('}');
        return sb.toString();
    }
}