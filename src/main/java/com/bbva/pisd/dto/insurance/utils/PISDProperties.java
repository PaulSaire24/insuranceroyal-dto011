package com.bbva.pisd.dto.insurance.utils;

public enum PISDProperties {

    QUERY_GET_PRODUCT_INFORMATION("PISD.GET_PRODUCT_INFORMATION"),
    QUERY_GET_PRODUCT_MODALITIES_INFORMATION("PISD.GET_PRODUCT_MODALITIES_INFORMATION"),
    QUERY_GET_PRODUCT_MODALITIES_INFORMATION_WITH_FLEXIBLE("PISD.GET_PRODUCT_MODALITIES_INFORMATION_WITH_FLEXIBLE"),
    ASO_MOCK_ENABLED("pisd.aso.mock.enabled"),
    ASO_MOCK_TIER_ENABLED("pisd.aso.mock.tier.enabled"),
    ASO_GET_TIER_MOCK("pisd.aso.get.tier.mock"),
    RIMAC_SIMULATION_MOCK("pisd.rimac.simulation.mock"),
    KEY_COMMERCIAL_VALUE("api.connector.commercialvalue.rimac.url"),
    COMMERCIAL_VALUE_QUERYSTRING_ANHOFAB("anhoFab="),
    COMMERCIAL_VALUE_QUERYSTRING_CODMODELO("codModelo="),
    COMMERCIAL_VALUE_QUERYSTRING_CODMARCA("codMarca="),
    ID_API_COMMERCIAL_VALUE("commercialvalue.rimac"),
    ID_API_CRYPTO("createCrypto"),
    ID_API_TIER("listCustomerClassifications"),
    ID_API_NOTIFICATIONS_GATEWAY_CREATE_EMAIL_SERVICE("createEmail"),
    ID_API_GIFOLE_INSURANCE_REQUEST_SERVICE("createGifoleInsuranceRequest"),
    ID_API_GIFOLE_ROYAL_INSURANCE_REQUEST_SERVICE("createGifoleInsuranceRequest"),
    ID_API_GIFOLE_ROYAL_SERVICE("gifole"),
    ID_API_LIMIT_PAGINATION("createLimit"),
    ID_API_SIMULATION_RIMAC("simulation.rimac"),
    ID_API_FINANCING_PLAN_RIMAC("financingplan.rimac"),
    ID_API_PAYMENT_SCHEDULE_RIMAC("paymentschedule.rimac"),
    URI_SIMULATION("/vehicular/V1/cotizacion"),
    URI_COMMERCIAL_VALUE("/vehicular/V1/vehiculo/valorcomercial"),
    ID_API_QUOTATION_DETAIL_RIMAC("quotationdetail.rimac"),
    URI_QUOTATION_DETAIL("/vehicular/V1/cotizacion/detalle/"),
    URI_FINANCING_PLAN("/vehicular/V1/cotizacion/cronograma/calcular-cuota"),
    URI_PAYMENT_SCHEDULE("/vehicular/V1/cotizacion/cotizacion-id/cronogramapago"),
    QUOTATION_DETAIL_QUERYSTRING("plan="),
    ID_API_QUOTATION_SELECTION_RIMAC("quotationselection.rimac"),
    URI_QUOTATION_SELECTION("/vehicular/V1/cotizacion/-/seleccionar"),

    HOST_RIMAC_HEADER("header.host.simulation.rimac"),
    SIGNEDHEADERS_RIMAC("pisd.signedheaders.rimac"),
    RIMAC_AWS_REGION("pisd.region.rimac"),
    RIMAC_AWS_SERVICE_NAME("pisd.servicename.rimac"),
    RIMAC_ACCESS_KEY("pisd.accesskey.rimac"),
    RIMAC_SECRET_ACCESS_KEY("pisd.secretaccesskey.rimac"),
    X_API_KEY_RIMAC_HEADER("header.xapikey.simulation.rimac"),

    KEY_OF_INSRC_LIST_RESPONSES("dtoInsurance"),
    FIELD_OR_FILTER_INSURANCE_MODALITY_TYPE("INSURANCE_MODALITY_TYPE"),
    FIELD_OR_FILTER_INSURANCE_PRODUCT_ID("INSURANCE_PRODUCT_ID"),
    FIELD_MAIN_CONSIDERATION_IND_TYPE("MAIN_CONSIDERATION_IND_TYPE"),
    QUERY_SELECT_INSRC_PRODUCT("PISD.SELECT_INSURANCE_PRODUCT"),
    FILTER_INSURANCE_PRODUCT_TYPE("INSURANCE_PRODUCT_TYPE"),
    FIELD_INSURANCE_PRODUCT_DESC("INSURANCE_PRODUCT_DESC"),

    QUERY_SELECT_INSRC_PRODUCT_FOR_RIMAC("PISD.SELECT_INSURANCE_BUSINESS"),
    FIELD_INSURANCE_BUSINESS_NAME("INSURANCE_BUSINESS_NAME"),

    QUERY_GET_PRODUCT_MODALITY_SELECTED("PISD.GET_PRODUCT_MODALITY_SELECTED"),
    FIELD_INSURANCE_COMPANY_MODALITY_ID("INSURANCE_COMPANY_MODALITY_ID"),
    FIELD_INSURANCE_MODALITY_NAME("INSURANCE_MODALITY_NAME"),
    FIELD_SUGGESTED_MODALITY_IND_TYPE("SUGGESTED_MODALITY_IND_TYPE"),
    FIELD_PUBLICATION_ORDER_NUMBER("PUBLICATION_ORDER_NUMBER"),
    FIELD_PAYMENT_FREQUENCY_NAME("PAYMENT_FREQUENCY_NAME"),

    QUERY_SELECT_CONSIDERATIONS("PISD.SELECT_CONSIDERATIONS"),
    FIELD_CNSD_PUBLICATION_ORDER_NUMBER("CNSD_PUBLICATION_ORDER_NUMBER"),
    FIELD_INSURANCE_CONSIDERATION_DESC("INSURANCE_CONSIDERATION_DESC"),
    FIELD_INSURANCE_CONSIDERATION_TYPE("INSURANCE_CONSIDERATION_TYPE"),
    FIELD_INSURANCE_CONSIDERATION_VALUE_TYPE("INSRC_CNSD_DATA_VALUE_TYPE"),
    FIELD_INSURANCE_CONSIDERATION_AMOUNT("INSURANCE_CONSIDERATION_AMOUNT"),
    FIELD_INSURANCE_CONSIDERATION_CURRENCY("CURRENCY_ID"),
    FIELD_INSURANCE_CONSIDERATION_PERCENTAGE("INSURANCE_CONSIDERATION_PER"),

    QUERY_SELECT_INSURANCE_SIMULATION_ID("PISD.SELECT_INSURANCE_SIMULATION_ID"),
    FIELD_Q_PISD_SIMULATION_ID0_NEXTVAL("NEXTVAL"),

    FIELD_LAST_CHANGE_BRANCH_ID("LAST_CHANGE_BRANCH_ID"),
    FIELD_SOURCE_BRANCH_ID("SOURCE_BRANCH_ID"),
 
    QUERY_INSERT_INSURANCE_SIMULATION("PISD.INSERT_INSURANCE_SIMULATION"),
    FIELD_INSRNC_COMPANY_SIMULATION_ID("INSRNC_COMPANY_SIMULATION_ID"),
    FIELD_CUSTOMER_ID("CUSTOMER_ID"),
    FIELD_CUSTOMER_SIMULATION_DATE("CUSTOMER_SIMULATION_DATE"),
    FIELD_CUST_SIMULATION_EXPIRED_DATE("CUST_SIMULATION_EXPIRED_DATE"),
    FIELD_BANK_FACTOR_TYPE("BANK_FACTOR_TYPE"),
    FIELD_BANK_FACTOR_AMOUNT("BANK_FACTOR_AMOUNT"),
    FIELD_BANK_FACTOR_PER("BANK_FACTOR_PER"),

    QUERY_INSERT_INSRNC_SIMLT_PRD("PISD.INSERT_INSRNC_SIMLT_PRD"),
    FIELD_INSURANCE_SIMULATION_ID("INSURANCE_SIMULATION_ID"),
    FIELD_CAMPAIGN_FACTOR_TYPE("CAMPAIGN_FACTOR_TYPE"),
    FIELD_CAMPAIGN_OFFER_1_AMOUNT("CAMPAIGN_OFFER_1_AMOUNT"),
    FIELD_CAMPAIGN_FACTOR_PER("CAMPAIGN_FACTOR_PER"),
    FIELD_SALE_CHANNEL_ID("SALE_CHANNEL_ID"),

    QUERY_INSERT_INSRNC_SIMLT_VEHICLE("PISD.INSERT_INSRNC_SIMLT_VEHICLE"),
    FIELD_VEHICLE_BRAND_ID("VEHICLE_BRAND_ID"),
    FIELD_VEHICLE_BRAND_NAME("VEHICLE_BRAND_NAME"),
    FIELD_VEHICLE_MODEL_ID("VEHICLE_MODEL_ID"),
    FIELD_VEHICLE_MODEL_NAME("VEHICLE_MODEL_NAME"),
    FIELD_VEHICLE_YEAR_ID("VEHICLE_YEAR_ID"),
    FIELD_COMMERCIAL_VEHICLE_AMOUNT("COMMERCIAL_VEHICLE_AMOUNT"),
    FIELD_CURRENCY_ID("CURRENCY_ID"),
    FIELD_NEW_VEHICLE_IND_TYPE("NEW_VEHICLE_IND_TYPE"),
    FIELD_VEHICLE_CIRCULATION_SCOPE_TYPE("VEHICLE_CIRCULATION_SCOPE_TYPE"),
    FIELD_VEH_CHANGE_RUDDER_IND_TYPE("VEH_CHANGE_RUDDER_IND_TYPE"),
    FIELD_VEHICLE_GAS_CONVERSION_TYPE("VEHICLE_GAS_CONVERSION_TYPE"),
    FIELD_VEHICLE_USE_TYPE("VEHICLE_USE_TYPE"),
    FIELD_VEHICLE_USAGE_DESC("VEHICLE_USAGE_DESC"),
    FIELD_VEHICLE_LICENSE_ID("VEHICLE_LICENSE_ID"),

    QUERY_SELECT_INSURANCE_SIMULATION_BY_QUOTATIONID("PISD.SELECT_INSURANCE_SIMULATION_BY_QUOTATIONID"),

    QUERY_INSERT_INSURANCE_QUOTATION("PISD.INSERT_INSURANCE_QUOTATION"),
    FIELD_POLICY_QUOTA_INTERNAL_ID("POLICY_QUOTA_INTERNAL_ID"),
    FIELD_INSURANCE_COMPANY_QUOTA_ID("INSURANCE_COMPANY_QUOTA_ID"),
    FIELD_QUOTE_DATE("QUOTE_DATE"),
    FIELD_QUOTA_HMS_DATE("QUOTA_HMS_DATE"),
    FIELD_POLICY_QUOTA_END_VALIDITY_DATE("POLICY_QUOTA_END_VALIDITY_DATE"),

    FIELD_CONTACT_EMAIL_DESC("CONTACT_EMAIL_DESC"),
    FIELD_CUSTOMER_PHONE_DESC("CUSTOMER_PHONE_DESC"),
    FIELD_PARTICIPANT_PERSONAL_ID("PARTICIPANT_PERSONAL_ID"),
    QUERY_INSERT_INSURANCE_QUOTATION_MOD("PISD.INSERT_INSURANCE_QUOTATION_MOD"),
    QUERY_UPDATE_INSURANCE_QUOTATION_MOD("PISD.UPDATE_INSURANCE_QUOTATION_MOD"),
    QUERY_UPDATE_INSURANCE_QUOTATION_MOD_AMOUNT("PISD.UPDATE_INSURANCE_QUOTATION_MOD_AMOUNT"),
    FIELD_PAYMENT_TERM_NUMBER("PAYMENT_TERM_NUMBER"),
    FIELD_POLICY_PAYMENT_FREQUENCY_TYPE("POLICY_PAYMENT_FREQUENCY_TYPE"),
    FIELD_POLICY_QUOTA_STATUS_TYPE("POLICY_QUOTA_STATUS_TYPE"),
    FIELD_FINANCING_START_DATE("FINANCING_START_DATE"),
    FIELD_FINANCING_END_DATE("FINANCING_END_DATE"),
    FIELD_PREMIUM_AMOUNT("PREMIUM_AMOUNT"),
    FIELD_PREMIUM_CURRENCY_ID("PREMIUM_CURRENCY_ID"),
    FIELD_SAVED_QUOTATION_IND_TYPE("SAVED_QUOTATION_IND_TYPE"),

    QUERY_INSERT_INSURANCE_QUOTATION_VEH("PISD.INSERT_INSURANCE_QUOTATION_VEH"),
    FIELD_REQUIRED_INSPECTION_IND_TYPE("REQUIRED_INSPECTION_IND_TYPE"),
    FIELD_GPS_IND_TYPE("GPS_IND_TYPE"),
    FIELD_CHASSIS_ID("CHASSIS_ID"),
    FIELD_VEHICLE_ENGINE_ID("VEHICLE_ENGINE_ID"),
    FIELD_VEHICLE_SEAT_NUMBER("VEHICLE_SEAT_NUMBER"),

    FIELD_CREATION_USER_ID("CREATION_USER_ID"),
    FIELD_USER_AUDIT_ID("USER_AUDIT_ID"),
    FIELD_CREATION_DATE("CREATION_DATE"),
    
    ASO_MOCK_BBVA_ENABLED("pisd.aso.mock.bbva.enabled"),
    ASO_MOCK_RIMAC_ENABLED("pisd.aso.mock.rimac.enabled"),
    ASO_GET_BLACKLISTBBVA_MOCK("pisd.aso.get.blacklistbbva.mock"),    
    ASO_GET_BLACKLISTHEALTHRIMAC_MOCK("pisd.aso.get.blacklisthealthrimac.mock"),    
    ASO_GET_BLACKLISTRISKRIMAC_MOCK("pisd.aso.get.blacklistriskrimac.mock"),    
    ID_API_BLACKLIST_ASO("blacklist.aso"),
    ID_API_BLACKLISTRISK_RIMAC("blacklistrisk.rimac"),
    ID_API_BLACKLISTEASYYES_RIMAC("blacklisteasyyes.rimac"),
    ID_API_BLACKLISTHEALTH_RIMAC("blacklisthealth.rimac"),
    URI_BLACKLIST_RISK("/vehicular/V1/cotizacion/riesgoPersona/validar"),
    URI_BLACKLIST_EASYYES("/api-operaciones-generales-polizas/V1/cotizacion/riesgoPersona/validar"),
	URI_BLACKLIST_HEALTH("/vehicular/V1/cotizacion/rechazoSalud/validar"),
	
	ASO_MOCK_SEARCH_ENABLED("pisd.aso.mock.search.enabled"),
    QUOTATION_SEARCH_QUERYSTRING_DOCUMENT_TYPE("tipoDocumento="),
    QUOTATION_SEARCH_QUERYSTRING_DOCUMENT_NUMBER("nroDocumento="),
    QUOTATION_SEARCH_QUERYSTRING_LIMIT("limite="),
    QUOTATION_SEARCH_QUERYSTRING_PLATE("placa="),
    QUOTATION_SEARCH_QUERYSTRING_PROD("ideProd="),
	ID_API_SEARCH_RIMAC("quotationsearch.rimac"),
	ASO_GET_SEARCH_MOCK("pisd.aso.get.search.mock"),

	QUERY_SELECT_INSRC_QUOTATION("PISD.SELECT_INSURANCE_QUOTATION"),

    KEY_REQUEST_INSRC_QUOTATION("POLICY_QUOTA_INTERNAL_ID"),
    URI_QUOTATION_SEARCH("/vehicular/V1/cotizacion/buscar"),

    QUERY_SELECT_INSURANCE_COMPANY_BY_COMPANYID("PISD.SELECT_INSURANCE_COMPANY"),
    FIELD_INSURANCE_COMPANY_DESC("INSURANCE_COMPANY_DESC"),

    QUERY_UPDATE_QUOTATION_REGISTER_ADDITIONAL_VEH("PISD.UPDATE_INSURANCE_QUOTATION_VEH"),
    URI_QUOTATION_REGISTER_ADDITIONAL("/vehicular/V1/cotizacion"),
    ID_API_QUOTATION_REGISTER_ADDITIONAL("quotationRegisterAdditional"),
    URI_REGISTER_ADDITIONAL_ADD_PERSON("/vehicular/V1/cotizacion/persona/agregar"),
    ID_API_ADD_PERSON_REGISTER_ADDITIONAL("quotationAddPersonRegisterAdditional"),

    QUERY_SELECT_INSURANCE_COMPANY_BY_COMPANY_REGISTER("PISD.SELECT_INSURANCE_QUOTATION_REGISTER"),
    QUERY_UPDATE_INSURANCE_QUOTATION_REGISTER("PISD.UPDATE_INSURANCE_QUOTATION"),
    QUERY_UPDATE_INSRNC_QUOTATION_MOD_REGISTER("PISD.UPDATE_INSRNC_QUOTATION_MOD"),

    QUERY_INSERT_INSURANCE_CONTRACT("PISD.INSERT_CONTRACT"),
    FIELD_INSURANCE_CONTRACT_ENTITY_ID("INSURANCE_CONTRACT_ENTITY_ID"),
    FIELD_INSURANCE_CONTRACT_BRANCH_ID("INSURANCE_CONTRACT_BRANCH_ID"),
    FIELD_INSRC_CONTRACT_INT_ACCOUNT_ID("INSRC_CONTRACT_INT_ACCOUNT_ID"),
    FIELD_CONTRACT_FIRST_VERFN_DIGIT_ID("CONTRACT_FIRST_VERFN_DIGIT_ID"),
    FIELD_CONTRACT_SECOND_VERFN_DIGIT_ID("CONTRACT_SECOND_VERFN_DIGIT_ID"),
    FIELD_INSURANCE_COMPANY_ID("INSURANCE_COMPANY_ID"),
    FIELD_POLICY_ID("POLICY_ID"),
    FIELD_INSURANCE_MANAGER_ID("INSURANCE_MANAGER_ID"),
    FIELD_INSURANCE_PROMOTER_ID("INSURANCE_PROMOTER_ID"),
    FIELD_CONTRACT_MANAGER_BRANCH_ID("CONTRACT_MANAGER_BRANCH_ID"),
    FIELD_CONTRACT_INCEPTION_DATE("CONTRACT_INCEPTION_DATE"),
    FIELD_INSURANCE_CONTRACT_START_DATE("INSURANCE_CONTRACT_START_DATE"),
    FIELD_INSURANCE_CONTRACT_END_DATE("INSURANCE_CONTRACT_END_DATE"),
    FIELD_INSRNC_VALIDITY_MONTHS_NUMBER("INSRNC_VALIDITY_MONTHS_NUMBER"),
    FIELD_INSURANCE_POLICY_END_DATE("INSURANCE_POLICY_END_DATE"),
    FIELD_POLICY_ANNULATION_DATE("POLICY_ANNULATION_DATE"),
    FIELD_AFTR_REPRG_PENDING_INST_NUMBER("AFTR_REPRG_PENDING_INST_NUMBER"),
    FIELD_CONTRACT_REGIS_CST_AGE_NUMBER("CONTRACT_REGIS_CST_AGE_NUMBER"),
    FIELD_DOMICILE_CONTRACT_ID("DOMICILE_CONTRACT_ID"),
    FIELD_CARD_ISSUING_MARK_TYPE("CARD_ISSUING_MARK_TYPE"),
    FIELD_ISSUED_RECEIPT_NUMBER("ISSUED_RECEIPT_NUMBER"),
    FIELD_PAYMENT_FREQUENCY_ID("PAYMENT_FREQUENCY_ID"),
    FIELD_NET_PREM_PLCY_ORIG_CURR_AMOUNT("NET_PREM_PLCY_ORIG_CURR_AMOUNT"),
    FIELD_SETTLE_PENDING_PREMIUM_AMOUNT("SETTLE_PENDING_PREMIUM_AMOUNT"),
    FIELD_POLICY_FEE_AMOUNT("POLICY_FEE_AMOUNT"),
    FIELD_LAST_INSTALLMENT_DATE("LAST_INSTALLMENT_DATE"),
    FIELD_INSTALLMENT_PERIOD_FINAL_DATE("INSTALLMENT_PERIOD_FINAL_DATE"),
    FIELD_INSURED_AMOUNT("INSURED_AMOUNT"),
    FIELD_BENEFICIARY_TYPE("BENEFICIARY_TYPE"),
    FIELD_RENEWAL_NUMBER("RENEWAL_NUMBER"),
    FIELD_NEXT_RENEWAL_START_DATE("NEXT_RENEWAL_START_DATE"),
    FIELD_POLICY_PYMT_PEND_DUE_DEBT_TYPE("POLICY_PYMT_PEND_DUE_DEBT_TYPE"),
    FIELD_CTRCT_DISPUTE_STATUS_TYPE("CTRCT_DISPUTE_STATUS_TYPE"),
    FIELD_CONTRACT_PREVIOUS_BRANCH_ID("CONTRACT_PREVIOUS_BRANCH_ID"),
    FIELD_PERIOD_NEXT_PAYMENT_DATE("PERIOD_NEXT_PAYMENT_DATE"),
    FIELD_CONT_PREVIOUS_SITUATION_TYPE("CONT_PREVIOUS_SITUATION_TYPE"),
    FIELD_ENDORSEMENT_POLICY_IND_TYPE("ENDORSEMENT_POLICY_IND_TYPE"),
    FIELD_INSRNC_CO_CONTRACT_STATUS_TYPE("INSRNC_CO_CONTRACT_STATUS_TYPE"),
    FIELD_CONTRACT_STATUS_ID("CONTRACT_STATUS_ID"),
    FIELD_OUTSTANDING_DEBT_IND_TYPE("OUTSTANDING_DEBT_IND_TYPE"),
    FIELD_ACCUM_OUTSTANDING_DEBT_AMOUNT("ACCUM_OUTSTANDING_DEBT_AMOUNT"),
    FIELD_PREV_PEND_BILL_RCPTS_NUMBER("PREV_PEND_BILL_RCPTS_NUMBER"),
    FIELD_SETTLE_PEND_VAR_PREMIUM_AMOUNT("SETTLE_PEND_VAR_PREMIUM_AMOUNT"),
    FIELD_SETTLE_PEND_FIX_PREMIUM_AMOUNT("SETTLE_PEND_FIX_PREMIUM_AMOUNT"),
    FIELD_INSURANCE_COMPANY_PRODUCT_ID("INSURANCE_COMPANY_PRODUCT_ID"),
    FIELD_AUTOMATIC_DEBIT_INDICATOR_TYPE("AUTOMATIC_DEBIT_INDICATOR_TYPE"),
    FIELD_FLEXIBLE_COVRG_PLAN_IND_TYPE("FLEXIBLE_COVRG_PLAN_IND_TYPE"),
    FIELD_NEW_MODALITY_IND_TYPE("NEW_MODALITY_IND_TYPE"),

    ID_QUERY_GET_QUOTATION_DETAIL("PISD.QUERY_FOR_GET_QUOTATION_SERVICE"),
    QUERY_SELECT_INSRNC_PRD_MODALITY_BY_RIMAC_IDS("PISD.SELECT_INSRNC_PRD_MODALITY_BY_COMPANY_MODALITY_ID"),
    COVERAGETYPE_ID_INCLUDED("INCLUDED"),
    COVERAGETYPE_NAME_INCLUDED("INCLUIDA"),
    COVERAGETYPE_ID_MANDATORY("MANDATORY"),
    COVERAGETYPE_NAME_MANDATORY("OBLIGATORIA"),
    COVERAGETYPE_ID_OPTIONAL("OPTIONAL"),
    COVERAGETYPE_NAME_OPTIONAL("OPCIONAL"),

    QUERY_SELECT_INSURANCE_CONTRACT("PISD.SELECT_INSURANCE_CONTRACT"),
    QUERY_UPDATE_INSURANCE_CONTRACT_STATUS("PISD.UPDATE_INSURANCE_CONTRACT_STATUS"),
    ID_QUERY_FOR_GET_INSURANCE_COMPANY_QUOTA_ID("PISD.QUERY_FOR_GET_INSURANCE_COMPANY_QUOTA_ID"),
    ID_API_CUSTOMER_INFORMATION("listCustomerInformation"),
    //Inicio Open Market
    QUERY_UPDATE_INSURANCE_SIMULATION_CUSTOMER("PISD.UPDATE_INSURANCE_SIMULATION_CUSTOMER"),
    QUERY_UPDATE_INSURANCE_QUOTATION_CUSTOMER("PISD.UPDATE_INSURANCE_QUOTATION_CUSTOMER"),
    //Fin Open Market
    BANK_PERU("bank.Peru"),
    ID_API_VALIDATE_GENERAL_DATA_VALUE("validateGeneralData.rimac"),
    URI_VALIDATE_GENERAL_DATA_KEY("rimac.validateGeneralData.uri");

    private final String value;

    PISDProperties(String value) { this.value = value; }

    public String getValue() { return value; }

}