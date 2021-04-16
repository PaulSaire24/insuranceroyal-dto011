package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class InsuranceProductDTO extends AbstractDTO {

    private String id;
    private String description;
    private List<InsuranceProductModalityDTO> plans;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<InsuranceProductModalityDTO> getPlans() { return plans; }
    public void setPlans(List<InsuranceProductModalityDTO> plans) { this.plans = plans; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public InsuranceProductDTO(String id, String description, List<InsuranceProductModalityDTO> plans) {
		this.id = id;
		this.description = description;
		this.plans = plans;
	}
    
	public InsuranceProductDTO() { }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceProductDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", plans=").append(plans);
        sb.append('}');
        return sb.toString();
    }
}