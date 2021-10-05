package com.bbva.pisd.dto.insurance.commons;

import java.util.List;

public class InsuranceProductDTO extends CommonOutputFieldsDTO {

    private String name;
    private List<InsuranceProductModalityDTO> plans;
    private List<UninsurableGoodsDTO> uninsurableGoods;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<InsuranceProductModalityDTO> getPlans() { return plans; }
    public void setPlans(List<InsuranceProductModalityDTO> plans) { this.plans = plans; }
    public List<UninsurableGoodsDTO> getUninsurableGoods() {return this.uninsurableGoods;}
    public void setUninsurableGoods(List<UninsurableGoodsDTO> uninsurableGoods) {this.uninsurableGoods = uninsurableGoods;}

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
        sb.append(", uninsurableGoods=").append(uninsurableGoods);
        sb.append('}');
        return sb.toString();
    }
}