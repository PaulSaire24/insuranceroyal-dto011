package com.bbva.pisd.dto.insurance.aso;

import com.bbva.pisd.dto.insurance.bo.customer.CustomerBO;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerListASO {

    private List<CustomerBO> data;

    public List<CustomerBO> getData() { return data; }

    public void setData(List<CustomerBO> data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerListASO{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
