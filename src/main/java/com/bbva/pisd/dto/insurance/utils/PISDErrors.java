package com.bbva.pisd.dto.insurance.utils;

public enum PISDErrors {

    QUERY_EMPTY_RESULT("PISD00120000", false, "No se encontró data en la BD"),
    STEERING_WHEEL_CHANGED("PISD00120002", false, "No se puede realizar una cotización porque el timón está cambiado"),
    ERROR_CONNECTION_TIER_ASO_SERVICE("PISD00120003", false, "No se pudo realizar una conexión con el servicio Tier ASO"),
    ERROR_CONNECTION_SIMULATION_RIMAC_SERVICE("PISD00120004", false, "No se pudo realizar una conexión con el servicio de simulación del Rimac"),
    ERROR_CONNECTION_QUOTATIONDETAIL_RIMAC_SERVICE("PISD00120006", false, "No se pudo realizar una conexión con el servicio detalle de cotización del Rimac"),
    ERROR_CONNECTION_CRYPTO_ASO_SERVICE("PISD00120007", false, "No se pudo realizar una conexión con el servicio Crypto ASO"),

    ERROR_CONNECTION_GIFOLE_ROYAL_ASO_SERVICE("PISD00120019", false, "No se pudo realizar una conexión con el servicio Gifole ASO"),
    ERROR_CONNECTION_GIFOLE_INSURANCE_REQUEST_ASO_SERVICE("PISD00120049", false, "No se pudo realizar una conexion con el servicio createGifoleInsuranceRequest ASO"),
    ERROR_CONNECTION_GIFOLE_ROYAL_INSURANCE_REQUEST_ASO_SERVICE("PISD00120019", false, "No se pudo realizar una conexión con el servicio createGifoleInsuranceRequest ASO"),
    ERROR_CONNECTION_GATEWAY_CREATE_EMAIL_ASO_SERVICE("PISD00120020", false, "No se pudo realizar una conexión con el servicio createEmail ASO"),
    
    ERROR_TO_CONNECT_SERVICE_BLACKLIST_ASO("PISD00120009", false, "Error al consultar el servicio de lista negra aso BBVA"),
    ERROR_TO_CONNECT_SERVICE_BLACKLISTHEALTH_RIMAC("PISD00120010", false, "Error al consultar el servicio de lista negra salud rimac"),
    ERROR_TO_CONNECT_SERVICE_BLACKLISTRISK_RIMAC("PISD00120011", false, "Error al consultar el servicio de lista negra riesgo rimac"),

    ERROR_NO_RESULT_JDBC_INSRC_QUOTATION("PISD00120012", false, "Error al consultar cotización: No se hallaron resultados."),
    ERROR_TO_CONNECT_SERVICE_INSRC_QUOTATION("PISD00120013", false, "Error al consultar el servicio de listado de cotización Rimac"),

    ERROR_QUOTATIONCREATION_WITHOUT_MODALITY("PISD00120016", false, "No se puede crear la cotización, falta seleccionar un plan"),
    ERROR_QUOTATIONCREATION_COULDNT_BE_SELECTED("PISD00120017", false, "No se seleccionó el plan en el servicio de Rimac"),

    ERROR_CONNECTION_VALIDATE_ADITIONAL_SERVICE("PISD00120021", false, "No se pudo realizar una conexión con el servicio de Registros Adicionales"),

    ERROR_CUSTOMER_WITHOUT_QUOTATION("PISD00120022", false, "El cliente no tiene cotizaciones vigentes."),
    ERROR_DOCUMENT_TYPE_INVALID("PISD00120025", false, "Se ha ingresado un tipo de documento inválido"),
    NON_EXISTENT_QUOTATION("PISD00120026", false, "El código de cotización ingresado no existe en la BD"),

    ERROR_CONNECTION_SCHEDULE_QUOTE_RIMAC_SERVICE("PISD00120027", false, "No se pudo realizar una conexión con el servicio de calcular cuota del Rimac"),
    ERROR_SCHEDULE_QUOTE_STARTDATE("PISD00120028", false, "La fecha de inicio de cronograma, debe ser mayor a la fecha actual"),

    ERROR_UPDATE_FIELDS_RIMAC_SERVICE("PISD00120029", false, "No se actualizarón los campos con exito en el servicio de Rimac"),
    ERROR_CONNECTION_REGISTER_DATOS_ADICIONALES("PISD00120030", false, "No se pudo realizar una conexión con Registrar datos adicionales de cotización vehicular"),
    ERROR_CONNECTION_PAYMENT_SCHEDULE_RIMAC_SERVICE("PISD00120031", false, "No se pudo realizar una conexión con el servicio de cronograma pago del Rimac"),

    QUERY_EMPTY_POLICY_QUOTA_INTERNAL_ID("PISD00120032", false, "No se encontró resultados con el id de poliza"),

    ERROR_CONNECTION_VALIDATE_CUSTOMER_SERVICE("PISD00120033", false, "No se pudo realizar la conexion con el servicio Listar Customer."),
    ERROR_CALL_TO_THIRD_PARTY("PISD00120034", false, "No se pudo realizar una conexión en llamar a tercero"),
    ERROR_NOT_PERIOD_VALIDATE("PISD00120035", false, "El campo periodo debe tener un valor valido."),
    ERROR_PERSON_ADD_REGISTER_ADICIONALES("PISD00120036", false, "No se Agrego la Persona en el servicio de Rimac en Registro Adicionales."),
    ERROR_CONNECTION_VALIDATE_PERSONA_SERVICE("PISD00120037", false, "No se pudo realizar la conexion con el servicio Persona Rimac."),
    EMPTY_RIMAC("PISD00120038", false, "No se puede obtener el error de Rimac"),

    WRONG_PRODUCT_CODE("PISD00120039", false, "El codigo de producto enviado es incorrecto"),
    WWRONG_PLAN_CODES("PISD00120040", false, "Los codigos de los planes son incorrectos"),
    PLANS_WITHOUT_CONSIDERATIONS("PISD00120041", false, "No se encontraron consideraciones para ningun plan"),
    PLAN_WITHOUT_CONSIDERATION("PISD00120042", false, "No se recupero ninguna consideracion para el plan seleccionado"),
    WRONG_PLAN_CODE("PISD00120043", false, "El codigo del plan enviado es incorrecto"),
    INSERTION_ERROR_IN_QUOTATION_TABLE("PISD00120044", false, "Parametros requeridos incompletos para el registro de la cotizacion"),
    INSERTION_ERROR_IN_QUOTATION_MOD_TABLE("PISD00120045", false, "Parametros requeridos incompletos para el registro del plan cotizado"),
    INSERTION_ERROR_IN_QUOTATION_VEH_TABLE("PISD00120046", false, "Parametros requeridos incompletos para el registro del vehiculo a asegurar"),

    VEHCOT001_RIMAC_ERROR_CODE("PISD00120047", false, "Rimac encontro errores en algunas validaciones"),
    RIMAC_SERVER_ERROR("PISD00120048", false, "Ocurrio un problema con el servidor"),
    ERROR_CHANNEL_NOT_VALID("PISD00120049",false,"El codigo del canal es incorrecto"),
    ERROR_COVERAGE_CODE("PISD00120050",false,"El codigo de cobertura es incorrecto"),
    ERROR_COMMERCIAL_VALUE_ANIO_FABRICACION_NOT_PROVIDED("PISD00120051",false,"El anio de fabricacion es obligatorio"),
    ERROR_COMMERCIAL_VALUE_COD_MARCA_NOT_PROVIDED("PISD00120052",false,"El codigo de la marca es obligatorio"),
    ERROR_COMMERCIAL_VALUE_COD_MODELO_NOT_PROVIDED("PISD00120053",false,"El codigo del modelo es obligatorio");

    private final String adviceCode;
    private final boolean rollback;
    private final String message;

    PISDErrors(String adviceCode, boolean rollback, String message) {
        this.adviceCode = adviceCode;
        this.rollback = rollback;
        this.message = message;
    }

    public String getAdviceCode() { return adviceCode; }
    public boolean isRollback() { return rollback; }
    public String getMessage() { return message; }
}
