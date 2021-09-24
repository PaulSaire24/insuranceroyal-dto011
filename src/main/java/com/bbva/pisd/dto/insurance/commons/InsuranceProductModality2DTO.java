package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class InsuranceProductModality2DTO extends AbstractDTO {

    private String id;
    private String name;
    private Boolean isSelected;
    private Boolean isRecommended;
    private Long order;
    private InstallmentModalityDTO installmentPlan;
    private List<CoverageModalityDTO> coverages;
    private List<BenefitModalityDTO> benefits;
    private List<ExclusionDTO> exclusions;
    private List<DeductibleDTO> deductibles;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Boolean getIsSelected() { return isSelected; }
    public void setIsSelected(Boolean isSelected) { this.isSelected = isSelected; }
    public Boolean getIsRecommended() { return isRecommended; }
    public void setIsRecommended(Boolean isRecommended) { this.isRecommended = isRecommended; }
    public Long getOrder() { return order; }
    public void setOrder(Long order) { this.order = order; }
    public InstallmentModalityDTO getInstallmentPlan() { return installmentPlan; }
    public void setInstallmentPlan(InstallmentModalityDTO installmentPlan) { this.installmentPlan = installmentPlan; }
    public List<CoverageModalityDTO> getCoverages() { return coverages; }
    public void setCoverages(List<CoverageModalityDTO> coverages) { this.coverages = coverages; }
    public List<BenefitModalityDTO> getBenefits() { return benefits; }
    public void setBenefits(List<BenefitModalityDTO> benefits) { this.benefits = benefits; }
    public List<ExclusionDTO> getExclusions() { return exclusions; }
    public void setExclusions(List<ExclusionDTO> exclusions) { this.exclusions = exclusions; }
    public List<DeductibleDTO> getDeductibles() { return deductibles; }
    public void setDeductibles(List<DeductibleDTO> deductibles) { this.deductibles = deductibles; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceProductModalityDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", isSelected='").append(isSelected).append('\'');
        sb.append(", isRecommended='").append(isRecommended).append('\'');
        sb.append(", installmentPlan=").append(installmentPlan);
        sb.append(", coverages=").append(coverages);
        sb.append(", benefits=").append(benefits);
        sb.append(", exclusions=").append(exclusions);
        sb.append(", deductibles=").append(deductibles);
        sb.append('}');
        return sb.toString();
    }
}