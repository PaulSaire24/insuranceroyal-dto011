package com.bbva.pisd.dto.insurance.utils;

public enum PISDErrors {

    QUERY_EMPTY_RESULT("PISD00120000", false, "No se encontró data en la BD"),
    STEERING_WHEEL_CHANGED("PISD00120002", false, "No se puede realizar una cotización porque el timón está cambiado"),
    ERROR_CONNECTION_TIER_ASO_SERVICE("PISD00120003", false, "No se pudo realizar una conexión con el servicio Tier ASO"),
    ERROR_CONNECTION_SIMULATION_RIMAC_SERVICE("PISD00120004", false, "No se pudo realizar una conexión con el servicio de simulación del Rimac"),
    ERROR_CONNECTION_QUOTATIONDETAIL_RIMAC_SERVICE("PISD00120006", false, "No se pudo realizar una conexión con el servicio detalle de cotización del Rimac"),
    ERROR_CONNECTION_CRYPTO_ASO_SERVICE("PISD00120007", false, "No se pudo realizar una conexión con el servicio Crypto ASO"),

    ERROR_CONNECTION_GIFOLE_CANCELLATION_ASO_SERVICE("PISD00120019", false, "No se pudo realizar una conexión con el servicio cancellation ASO"),
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

    ERROR_UPDATE_FIELDS_RIMAC_SERVICE("PISD00120027", false, "No se actualizarón los campos con exito en el servicio de Rimac"),
    ERROR_CONNECTION_REGISTER_DATOS_ADICIONALES("PISD00120028", false, "No se pudo realizar una conexión con Registrar datos adicionales de cotización vehicular"),

    ERROR_CONNECTION_SCHEDULE_QUOTE_RIMAC_SERVICE("PISD00120029", false, "No se pudo realizar una conexión con el servicio de calcular cuota del Rimac"),
    ERROR_SCHEDULE_QUOTE_STARTDATE("PISD00120030", false, "La fecha de inicio de cronograma, debe ser mayor a la fecha actual");




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
