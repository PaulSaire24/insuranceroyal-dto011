package com.bbva.pisd.dto.insurance.mock;

import com.bbva.pisd.dto.insurance.aso.BlackListASO;

import com.bbva.pisd.dto.insurance.aso.CustomerListASO;
import com.bbva.pisd.dto.insurance.aso.GetContactDetailsASO;
import com.bbva.pisd.dto.insurance.aso.crypto.CryptoASO;
import com.bbva.pisd.dto.insurance.aso.tier.TierASO;

import com.bbva.pisd.dto.insurance.blacklist.EntityOutBlackListDTO;

import com.bbva.pisd.dto.insurance.bo.*;
import com.bbva.pisd.dto.insurance.bo.detail.InsuranceQuotationDetailBO;
import com.bbva.pisd.dto.insurance.bo.financing.CronogramaPagoBO;
import com.bbva.pisd.dto.insurance.bo.financing.FinancingPlanBO;
import com.bbva.pisd.dto.insurance.bo.registeradditional.RegisterAdditionalVehBO;
import com.bbva.pisd.dto.insurance.bo.registeradditional.ValidateGeneralDataBO;
import com.bbva.pisd.dto.insurance.bo.simulation.InsuranceSimulationBO;

import com.bbva.pisd.dto.insurance.commons.*;

import com.bbva.pisd.dto.insurance.dao.ConsiderationsDAO;
import com.bbva.pisd.dto.insurance.dao.InsuranceProductModalityDAO;

import com.bbva.pisd.dto.insurance.financing.FinancingPlanDTO;
import com.bbva.pisd.dto.insurance.mapper.ObjectMapperHelper;

import com.bbva.pisd.dto.insurance.quotation.InsuranceQuotationDTO;
import com.bbva.pisd.dto.insurance.quotation.RegisterAdditionalQuotationDTO;

import com.bbva.pisd.dto.insurance.search.EntityOutSearchDTO;
import com.bbva.pisd.dto.insurance.search.InsuranceSearchDTO;
import com.bbva.pisd.dto.insurance.search.SearchQuotationDTO;

import com.bbva.pisd.dto.insurance.simulation.InsuranceSimulationDTO;

import java.io.IOException;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;

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

    public FinancingPlanBO getSimulateInsuranceQuotationInstallmentPlanRequestRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/financing/simulateInsuranceQuotationInstallmentPlanRequestRimac.json"),
                FinancingPlanBO.class);
    }

    public FinancingPlanDTO getSimulateInsuranceQuotationInstallmentPlanRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/financing/simulateInsuranceQuotationInstallmentPlanRequest.json"),
                FinancingPlanDTO.class);
    }

    public FinancingPlanBO getSimulateInsuranceQuotationInstallmentPlanResponseRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/financing/simulateInsuranceQuotationInstallmentPlanResponseRimac.json"),
                FinancingPlanBO.class);
    }

    public FinancingPlanBO getSimulateInsuranceQuotationInstallmentPlanCronogramaPagoRequestRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/financing/simulateInsuranceQuotationInstallmentPlanCronogramaPagoRequestRimac.json"),
                FinancingPlanBO.class);
    }

    public CronogramaPagoBO getSimulateInsuranceQuotationInstallmentPlanCronogramaPagoResponseRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/financing/simulateInsuranceQuotationInstallmentPlanCronogramaPagoResponseRimac.json"),
                CronogramaPagoBO.class);
    }

    public FinancingPlanDTO getSimulateInsuranceQuotationInstallmentPlanResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/financing/simulateInsuranceQuotationInstallmentPlanResponse.json"),
                FinancingPlanDTO.class);
    }

    public List<InsuranceProductModalityDAO> getProductModalitiesBeginWith3() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/productModalitiesBeginWith3.json"),
                InsuranceProductModalityDAO[].class));
    }

    public List<InsuranceProductModalityDAO> getProductModalitiesBeginWith2() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/productModalitiesBeginWith2.json"),
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

    public InsuranceSimulationBO getRimacInsuranceSimulationResponseMonthlyFrequency() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationResponseRimacMonthlyFrequency.json"),
                InsuranceSimulationBO.class);
    }

    public InsuranceSimulationBO getRimacInsuranceSimulationResponseAnnualFrequency() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationResponseRimacDiscountedAnnualFrequency.json"),
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

    public GetContactDetailsASO getContactDetailsResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/contactDetails/getContactDetails.json"),
                GetContactDetailsASO.class);
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
                        "com/bbva/pisd/dto/insurance/mock/creation/rimac/getDetail/quotationDetailResponseRimacMonthlyPeriodicity.json"),
                InsuranceQuotationDetailBO.class);
    }

    public InsuranceQuotationDetailBO getInsuranceQuotationDetailResponseRimacAnnualPremium() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/creation/rimac/getDetail/quotationDetailResponseRimacAnnualPeriodicity.json"),
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

    public SearchQuotationBO getSearchMockResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/search/searchResponse.json"),
                SearchQuotationBO.class);
    }

    public SearchQuotationBO getSearchErrorResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/search/searchResponseError.json"),
                SearchQuotationBO.class);
    }

    public InsuranceSearchDTO getSearchQuotationsRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/search/searchRequest.json"),
                InsuranceSearchDTO.class);
    }

    public InsuranceSearchDTO getSearchQuotationRequestInvalidDocumentType() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/search/searchRequestInvalidDocumentType.json"),
                InsuranceSearchDTO.class);
    }

    public InsuranceSearchDTO getSearchQuotationRequestInvalidLengthDocumentNumber() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/search/searchRequestInvalidLengthDocumentNumber.json"),
                InsuranceSearchDTO.class);
    }

    public Map<String, Object> getResponseQueryForGetQuotationDetailService() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/detail/responseQuery.json"),
                Map.class);
    }

    public RegisterAdditionalQuotationDTO getRegisterAdditionalRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/register/registerAdditionalRequest.json"),
                RegisterAdditionalQuotationDTO.class);
    }

    public RegisterAdditionalVehBO getRegisterAdditionalOKResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/register/registerAdditionalResponse.json"),
                RegisterAdditionalVehBO.class);
    }

    public ValidateGeneralDataBO getValidateGeneralDataOKResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/register/rimac/validateGeneralData.json"),
                ValidateGeneralDataBO.class);
    }

    public CustomerListASO getCustomerDataResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/aditional/customerData.json"),
                CustomerListASO.class);
    }

    public SearchQuotationBO getSearchQuotationsResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/search/searchQuotations.json"),
                SearchQuotationBO.class);
    }

    public List<Map<String, Object>> getSearchQuotationBBVAResponse() {
        List<Map<String, Object>> response = new ArrayList<>();
        Map<String, Object> row = new HashMap<>();
        String productId = "01827";
        String productDesc = "Seguro vehicular";
        row.put("PRODUCT_TYPE", productId);
        row.put("PRODUCT_DESC", productDesc);
        row.put("OPERATION_DATE", "2020-11-17 00:00:00.0");
        row.put("OPERATION_HMS_DATE", "2020-11-17 14:55:23.185763");
        row.put("PLAN_ID", "01");
        row.put("PLAN_PERIOD_ID", "M");
        row.put("STATUS_ID", "COT");
        row.put("PLAN_NAME", "BASICO");
        row.put("PLAN_SUGGESTED", "S");
        row.put("PERIOD_NAME", "Mensual");
        row.put("AMOUNT", "53.00");
        row.put("CURRENCY", "USD");
        response.add(row);

        row = new HashMap<>();
        row.put("PRODUCT_TYPE", productId);
        row.put("PRODUCT_DESC", productDesc);
        row.put("OPERATION_DATE", "2020-11-17 00:00:00.0");
        row.put("OPERATION_HMS_DATE", "2020-11-17 14:55:23.185763");
        row.put("PLAN_ID", "02");
        row.put("PLAN_PERIOD_ID", "S");
        row.put("STATUS_ID", "EMI");
        row.put("PLAN_NAME", "ESTANDAR");
        row.put("PLAN_SUGGESTED", "N");
        row.put("PERIOD_NAME", "Semestral");
        row.put("AMOUNT", "77.00");
        row.put("CURRENCY", "USD");
        response.add(row);
        return response;
    }

    public SearchQuotationDTO getSearchQuotationBBVAMappedResponse() {
        SearchQuotationDTO out = new SearchQuotationDTO();
        out.setProduct(new InsuranceProductDTO());
        out.getProduct().setPlans(new ArrayList<>());

        InsuranceProductModalityDTO plan = new InsuranceProductModalityDTO();
        InstallmentModalityDTO inst = new InstallmentModalityDTO();
        PaymentPeriodDTO periodo = new PaymentPeriodDTO();
        InsurancePrimeAmountDTO ammount = new InsurancePrimeAmountDTO();
        ammount.setAmount(53.00);
        ammount.setCurrency("USD");
        inst.setAmount(ammount);
        inst.setPeriod(periodo);
        plan.setInstallmentPlan(inst);

        out.getProduct().setId("01827");
        out.getProduct().setDescription("Seguro vehicular");
        out.setOperationDate(new Date());
        out.setId("0000003345454554");
        out.setLicensePlate("AAN680");

        QuotationStatusDTO status = new QuotationStatusDTO();
        status.setId("COT");
        out.setStatus(status);

        plan.setId("02");
        plan.setName("BASICO");
        periodo.setId("S");
        periodo.setName("Mensual");

        out.getProduct().getPlans().add(plan);

        plan = new InsuranceProductModalityDTO();
        inst = new InstallmentModalityDTO();
        periodo = new PaymentPeriodDTO();
        inst.setPeriod(periodo);
        inst.setAmount(ammount);
        plan.setInstallmentPlan(inst);

        plan.setId("01");
        plan.setName("ESTANDAR");
        periodo.setId("M");
        periodo.setName("Semestral");
        out.getProduct().getPlans().add(plan);

        VehicleModelDTO model = new VehicleModelDTO();
        model.setId("281598");
        model.setName("A7 SPORTBACK 3.0 TSFI QUATTRO");
        model.setYear(2014L);
        VehicleBrandDTO brand = new VehicleBrandDTO();
        brand.setId("3394");
        brand.setName("ACURA");
        model.setBrand(brand);
        out.setModel(model);

        return out;
    }

    public EntityOutSearchDTO getSearchQuotationResponse() {
        EntityOutSearchDTO out = new EntityOutSearchDTO();
        List<SearchQuotationDTO> listquot = new ArrayList<>();
        SearchQuotationDTO quot = getSearchQuotationBBVAMappedResponse();

        quot.setId("0000003345454554");
        quot.setLicensePlate("AAN680");
        quot.setMaturityDate(new Date());

        VehicleModelDTO model = new VehicleModelDTO();
        VehicleBrandDTO brand = new VehicleBrandDTO();
        brand.setId("3394");
        brand.setName("ACURA");
        model.setId("281598");
        model.setName("A7 SPORTBACK 3.0 TSFI QUATTRO");
        model.setBrand(brand);
        quot.setModel(model);

        listquot.add(quot);
        out.setData(listquot);
        return out;
    }

    public List<CoverageModalityDTO> getCoveragesByResponse() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationCoverageResponse.json"),
                CoverageModalityDTO[].class));
    }

    public List<CoberturaBO> getCoveragesByResponseRimac() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationCoveragesResponseRimac.json"),
                CoberturaBO[].class));
    }

    public InsuranceSimulationBO getResponseRimac() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulationResponseRimacMonthlyFrequency.json"),
                InsuranceSimulationBO.class);
    }

    public List<ConsiderationsDAO> getConsiderationsByQuery() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/pisd/dto/insurance/mock/simulation/simulateQuerySelectConsiderations.json"),
                ConsiderationsDAO[].class));
    }


}