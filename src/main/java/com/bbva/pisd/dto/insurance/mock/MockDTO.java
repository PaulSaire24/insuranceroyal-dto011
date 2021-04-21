package com.bbva.pisd.dto.insurance.mock;

import com.bbva.pisd.dto.insurance.aso.BlackListASO;

import com.bbva.pisd.dto.insurance.aso.crypto.CryptoASO;
import com.bbva.pisd.dto.insurance.aso.gifole.GifoleASO;
import com.bbva.pisd.dto.insurance.aso.tier.TierASO;
import com.bbva.pisd.dto.insurance.blacklist.EntityOutBlackListDTO;

import com.bbva.pisd.dto.insurance.bo.*;

import com.bbva.pisd.dto.insurance.bo.detail.InsuranceQuotationDetailBO;
import com.bbva.pisd.dto.insurance.bo.simulation.InsuranceSimulationBO;
import com.bbva.pisd.dto.insurance.commons.InsuranceProductModalityDTO;

import com.bbva.pisd.dto.insurance.dao.ConsiderationsDAO;
import com.bbva.pisd.dto.insurance.dao.InsuranceProductModalityDAO;
import com.bbva.pisd.dto.insurance.mapper.ObjectMapperHelper;
import com.bbva.pisd.dto.insurance.quotation.InsuranceQuotationDTO;
import com.bbva.pisd.dto.insurance.simulation.InsuranceSimulationDTO;

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

    public CryptoASO getCryptoMockResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/crypto/cryptoResponse.json"),
                CryptoASO.class);
    }

    public TierASO getTierMockResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/tier/tierResponse.json"),
                TierASO.class);
    }

    public InsuranceSimulationDTO getInsuranceSimulationRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationRequest.json"),
                InsuranceSimulationDTO.class);
    }

    public List<InsuranceProductModalityDAO> getProductModalitiesFromDBMockResponse() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/productModalitiesFromDBMockResponse.json"),
                InsuranceProductModalityDAO[].class));
    }

    public InsuranceSimulationBO getInsuranceSimulationRequestRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationRequestRimac.json"),
                InsuranceSimulationBO.class);
    }

    public InsuranceSimulationDTO getInsuranceSimulationRequestWithEmptyTierAndWithoutLicencePlate() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationRequestWithEmptyTierAndWithoutLicencePlate.json"),
                InsuranceSimulationDTO.class);
    }

    public InsuranceSimulationDTO getInsuranceSimulationRequestWithoutTier() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationRequestWithoutTier.json"),
                InsuranceSimulationDTO.class);
    }

    public InsuranceSimulationBO getInsuranceSimulationResponseRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationResponseRimac.json"),
                InsuranceSimulationBO.class);
    }

    public InsuranceSimulationDTO getInsuranceSimulationResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationResponse.json"),
                InsuranceSimulationDTO.class);
    }

    public List<ConsiderationsDAO> getConsiderationsFromDBMockResponse() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/considerationsFromDBMockResponse.json"),
                ConsiderationsDAO[].class));
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

    public SelectionQuotationBO getInsuranceQuotationSelectionOKResponseRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/creation/rimac/selection/selectionOK.json"),
                SelectionQuotationBO.class);
    }

    public InsuranceQuotationDetailBO getInsuranceQuotationDetailResponseRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/creation/rimac/getDetail/quotationDetailResponseRimac.json"),
                InsuranceQuotationDetailBO.class);
    }

    public InsuranceQuotationDTO getInsuranceCreationRequestWithoutPlans() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/creation/creationRequestWithoutPlan.json"),
                InsuranceQuotationDTO.class);
    }

    public InsuranceQuotationDTO getInsuranceCreationRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/creation/creationRequest.json"),
                InsuranceQuotationDTO.class);
    }

    public SelectionQuotationBO getInsuranceQuotationSelectionWithErrorsResponseRimac() throws IOException {
        return  objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/creation/rimac/selection/selectionWithErrors.json"),
                SelectionQuotationBO.class);
    }

    public GifoleASO getGifoleResponseASO() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/creation/gifole/gifoleResponse.json"),
                GifoleASO.class);
    }

    public List<DatoParticularBO> getDatosParticularesList() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/datosParticulares.json"),
                DatoParticularBO[].class));
    }

    public InsuranceQuotationDTO getInsuranceQuotationResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/creation/creationResponse.json"),
                InsuranceQuotationDTO.class);
    }

}