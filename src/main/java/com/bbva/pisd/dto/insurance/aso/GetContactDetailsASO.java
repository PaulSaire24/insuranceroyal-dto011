package com.bbva.pisd.dto.insurance.aso;

import com.bbva.pisd.dto.insurance.bo.ContactDetailsBO;

import java.util.List;

public class GetContactDetailsASO {

    private List<ContactDetailsBO> data;

    public List<ContactDetailsBO> getData() {return data;}
    public void setData(List<ContactDetailsBO> data) {this.data = data;}

}
