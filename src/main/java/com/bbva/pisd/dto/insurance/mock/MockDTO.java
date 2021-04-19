package com.bbva.pisd.dto.insurance.mock;

import com.bbva.pisd.dto.insurance.aso.BlackListASO;

import com.bbva.pisd.dto.insurance.blacklist.EntityOutBlackListDTO;

import com.bbva.pisd.dto.insurance.bo.SelectionQuotationPayloadBO;

import com.bbva.pisd.dto.insurance.bo.BlackListHealthRimacBO;
import com.bbva.pisd.dto.insurance.bo.BlackListIndicatorBO;
import com.bbva.pisd.dto.insurance.bo.BlackListRiskRimacBO;

import com.bbva.pisd.dto.insurance.commons.InsuranceProductModalityDTO;

import com.bbva.pisd.dto.insurance.mapper.ObjectMapperHelper;

import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public final class MockDTO {

    private static final MockDTO INSTANCE = new MockDTO();
    private ObjectMapperHelper objectMapperHelper = ObjectMapperHelper.getInstance();

    private MockDTO() {

    }

    public static MockDTO getInstance() {
        return INSTANCE;
    }

    public List<InsuranceProductModalityDTO> getPlansWithInstallmentPlan() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/plansWithInstallmentPlan.json"),
                InsuranceProductModalityDTO[].class));
    }

    public BlackListASO getBlackListASOMockResponse() throws IOException {
    	return objectMapperHelper.readValue(
    			Thread.currentThread().getContextClassLoader().getResourceAsStream(
    					"com/bbva/pisd/dto/insurance/mock/blacklist/blackListCustomerIndicatorResponse.json"),
    			BlackListASO.class);
    }
    
    public BlackListHealthRimacBO getBlackListHealthRimacMockResponse() throws IOException {
    	return objectMapperHelper.readValue(
    			Thread.currentThread().getContextClassLoader().getResourceAsStream(
    					"com/bbva/pisd/dto/insurance/mock/blacklist/blackListHealthRimacResponse.json"),
    			BlackListHealthRimacBO.class);
    }
    
    public BlackListRiskRimacBO getBlackListRiskRimacMockResponse() throws IOException {
    	return objectMapperHelper.readValue(
    			Thread.currentThread().getContextClassLoader().getResourceAsStream(
    					"com/bbva/pisd/dto/insurance/mock/blacklist/blackListRiskRimacResponse.json"),
    			BlackListRiskRimacBO.class);
    }

    public BlackListIndicatorBO getBlackListValidationPositiveASOMockResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                    "com/bbva/pisd/dto/insurance/mock/blacklist/blackListValidationPositiveASO.json"),
                BlackListIndicatorBO.class);
    }
    
    public BlackListIndicatorBO getBlackListValidationNegativeASOMockResponse() throws IOException {
    	return objectMapperHelper.readValue(
    			Thread.currentThread().getContextClassLoader().getResourceAsStream(
    					"com/bbva/pisd/dto/insurance/mock/blacklist/blackListValidationNegativeASO.json"),
    			BlackListIndicatorBO.class);
    }
    
    public SelectionQuotationPayloadBO getBlackListValidationPositiveRimacMockResponse() throws IOException {
    	return objectMapperHelper.readValue(
    			Thread.currentThread().getContextClassLoader().getResourceAsStream(
    					"com/bbva/pisd/dto/insurance/mock/blacklist/blackListValidationPositiveRimac.json"),
    			SelectionQuotationPayloadBO.class);
    }
    
    public SelectionQuotationPayloadBO getBlackListValidationNegativeRimacMockResponse() throws IOException {
    	return objectMapperHelper.readValue(
    			Thread.currentThread().getContextClassLoader().getResourceAsStream(
    					"com/bbva/pisd/dto/insurance/mock/blacklist/blackListValidationNegativeRimac.json"),
    			SelectionQuotationPayloadBO.class);
    }

    public EntityOutBlackListDTO getInsuranceBlackListResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                    "com/bbva/pisd/dto/insurance/mock/blacklist/blackListResponse.json"),
                EntityOutBlackListDTO.class);
    }

}