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
	public static final String LOWERCASE_LETTER_S = "s";

	public static final class ProductModality{
		private ProductModality(){}

		public static final String TYPE_PLAN_FLEXIBLE = "04";
		public static final String NAME_PLAN_FLEXIBLE = "flexible";
		public static final String NO_PLAN_CODE = "00";
		public static final String TYPE_PLAN_BASICO = "01";
		public static final String TYPE_PLAN_ESTANDAR = "02";
		public static final String TYPE_PLAN_FULL_COBERTURAS = "03";
	}

	public static final class Channel{
		private Channel(){}
		public static final String BANCA_POR_INTERNET = "BI";
		public static final String PIC = "PC";
		public static final String ZONA_PUBLICA = "CZ";
		public static final String TELEMARKETING = "TM";
	}

	public static final class Unit{
		private Unit(){}

		public static final String TYPE_TEXT = "TEXT";
		public static final String TYPE_AMOUNT = "AMOUNT";
	}

	public static final class DatosParticulares{
		private DatosParticulares(){}
		public static final String ETIQUETA_ENDOSO = "IND_CESION_DERECHO_RG";

	}

	public static final class CategoriaAgrupador{
		private CategoriaAgrupador(){}
		public static final String TIPO_AGRUPADOR_PERSONA = "PERSONA";
		public static final String TIPO_AGRUPADOR_VEHICULO = "VEHICULO";
		public static final String CODIGO_AGRUPADOR_PERSONA = "1";
		public static final String CODIGO_AGRUPADOR_VEHICULO = "3";
	}

	public static final class ProductEasyYesLife{
		private ProductEasyYesLife(){}
		public static final String EASY_YES_RIMAC = "EASYYES" ;
		public static final String EASY_YES_PRODUCT_CODE = "840";
	}
	
	private PISDConstants() { }

}
