package com.bbva.pisd.dto.insurance.utils;

public class PISDConstants {

	public static final String MOCKERSEARCH = "MOCKERSEARCH";
	public static final String MOCKERRIMAC = "MOCKERRIMAC";
	public static final String MOCKERBBVA = "MOCKERBBVA";
	public static final String HEALTH_RIMAC = "SALUD";
	public static final String VEHICULAR_RIMAC = "VEHICULAR" ;
	public static final String LETTER_SI = "S" ;
	public static final String LETTER_NO = "N" ;
	public static final String BLACKLIST_BLOCKED = "1" ;
	public static final String BLACKLIST_COMPANY_RIMAC = "RIMAC" ;
	public static final String BLACKLIST_COMPANY_CHUBB = "CHUBB" ;
	public static final String BLACKLIST_MSJ_REJECT = "BLOQUEADO" ;
	public static final String MSJ_EN_TRAMITE = "EN TRAMITE" ;
	public static final String MSJ_SIN_PLACA = "SIN PLACA";
	public static final String TAG_SI = "SI" ;
	public static final String TAG_NO = "NO" ;
	public static final String TAG_MODELO = "MODELOS_DE_VEHICULOS" ;
	public static final String TAG_MARCA = "MARCAS_DE_VEHICULOS" ;
	public static final String TAG_ANIO_FABRICACION = "WEB_ANOS_DE_FABRICACION" ;
	public static final String TAG_UBICACION = "UBICACIÓN" ;
	public static final String TAG_USO_VEHICULO = "USOS_DE_VEHICULOS" ;
	public static final String TAG_GPS = "GPS" ;
	public static final String TAG_REQUIERE_INSPECCION = "REQUIERE INSPECCION" ;
	public static final String TAG_TIMON_CAMBIADO = "TIMON_CAMBIADO_30" ;
	public static final String TAG_FACTOR_CAMPANIA = "FACTOR CAMPAÑA" ;
	public static final String TAG_NUMERO_MOTOR = "NUMERO_DE_MOTOR" ;
	public static final String TAG_NUMERO_SERIE = "NUMERO_DE_SERIE" ;
	public static final String TAG_NRO_PASAJEROS = "NRO_PASAJEROS" ;
	public static final String UBICACION_LIMA = "LIMA" ;
	public static final String UBICACION_PROVINCIA = "PROVINCIA" ;
	public static final String CHANNEL_GLOMO = "pisd.channel.glomo.aap";
	public static final String CHANNEL_PZONE = "pisd.channel.pzone.aap"; //Open Market

	public static final class ProductModality{
		private ProductModality(){}

		public static final String TYPE_PLAN_FLEXIBLE = "13";
		public static final String NAME_PLAN_FLEXIBLE = "flexible";
	}

	public static final class Endosatario{
		private Endosatario(){}

		public static final String RUC = "20100130204";
		public static final String PORCENTAJE = "100";
	}

	
	private PISDConstants() { }

}
