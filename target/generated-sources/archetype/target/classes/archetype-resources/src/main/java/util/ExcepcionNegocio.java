#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

public class ExcepcionNegocio extends Exception {

	private static final long serialVersionUID = 8482894910414380469L;

	public static final int ERROR_DESCONOCIDO = 0;

	/** Indica que se ha producido un error intentar convertir un fichero */
	public static final int ERROR_CONVERTIR_FICHERO = 4;

	public static final int ERROR_BD_INSERCION = 30;
	public static final int ERROR_BD_ACTUALIZACION = 31;
	public static final int ERROR_BD_RECUPERACION = 32;
	public static final int ERROR_BD_ELIMINACION = 33;
	public static final int ERROR_BD_BLOQUEO = 36;

	public static final int ERROR_IMP_ABRIR_FICHERO = 50;
	public static final int ERROR_IMP_LONGITUD_INCORRECTA = 51;

	/** Indica que se ha producido un error al consultar un registro que ya ha
	 *  sido borrado. */
	public static final int ERROR_BORRADO = 99;

	/** Indica que se ha producido un error de TimeStamp */
	public static final int ERROR_TIMESTAMP = 100;

	/** Indica que se ha producido un error de conexión a BBDD */
	public static final int ERROR_BASE_DATOS = 101;

	/** Indica que se está intentando acceder a una funcionalidad
	 * no permitida para el usuario */
	public static final int ERROR_ACCESO = 102;

	/** Indica que se ha producido un error en los parámetros
	 * con los que se accede a una página */
	public static final int ERROR_PARAMETRO = 103;

	/** Indica que se ha producido un error al no encontrar
	 * un fichero properties */
	public static final int ERROR_MISSING_RESOURCE = 104;

	/** Indica que se ha producido un error en la conversión entre tipos de 
	 * datos */
	public static final int ERROR_PARSER = 105;

	/** Indica que se ha producido un error al no encontrar
	 * el ususario en session */
	public static final int ERROR_USUARIO_NULO = 106;

	/** Indica que se ha producido un error al no encontrar la ruta */
	public static final int ERROR_RUTA_NO_ENCONTRADA = 107;

	/** Indica que se ha producido una inconsistencia de datos */
	public static final int ERROR_INCONSISTENCIA_DATOS = 108;

	/** Inicia que se ha producido un error en la consistencia de los estados y
	 *  las fechas en las tablas de Históricos del Acta */
	public static final int ERROR_VALIDACION_HIST_ACTA = 109;

	/** Indica que la suma de los importes de los cobros es superior al importe
	 * del acta */
	public static final int ERROR_IMPORTE_COBROS_SUPERIOR = 110;

	/** Indica que se ha producido un error en la firma del documento*/
	public static final int ERROR_FIRMA_DOCUMENTO = 200;    
	/**
	 *  Indica que se ha producido un error en la verifiacion del documento xml
	 */
	public static final int ERROR_VERIFICACION_DOCUMENTO = 201;

	/** Indica que se ha producido un error en el envio a TGSS*/
	public static final int ERROR_ENVIO_PETICION_TGSS = 202;

	/** Indica que se ha producido un error en el envio a TGSS*/
	public static final int ERROR_RECEPCION_DATOS_TGSS = 207;

	/** Indica que se ha producido un error al enviar el correo */
	public static final int ERROR_ENVIO_CORREO = 34;

	/** Indica que se ha producido un error al enviar la comunicación al LVE */
	public static final int ERROR_LVE = 115;

	/** Indica que se ha producido un error al enviar la comunicación al LVE */
	public static final int ERROR_LVE2 = 120;

	/** Indica que se ha producido un error en el envio a Inteco*/
	public static final int ERROR_ENVIO_PETICION_INTECO = 203; 

	/** Indica que se ha producido un error en el envio a Inteco por el campo número y
	 * no queremos que se nos concatene la descripción póngase en contacto con el CAU*/
	public static final int ERROR_ENVIO_PETICION_INTECO_2 = 208;

	/** Indica que se ha producido un error en el envio a notificación Inteco*/
	public static final int ERROR_ENVIO_NOTIFICACION_INTECO = 204; 
	/** Indica que se ha producido un error en el envio a notificación Inteco*/
	public static final int ERROR_ENVIO_ESTADO_INTECO = 205; 

	/** Indica que ocurrio un error al inseertar un Log de auditoria*/
	public static final int ERROR_INSERT_LOG_AUDITORIA = 301;

	/** Indica que ocurrio un error al comparar VOs*/
	public static final int ERROR_COMPARAR_VOS = 302;

	public static final int ERROR_CAMBIAR_IDIOMA = 303;

	public static final int ERROR_CARGA_FICHERO = 210;

	private final int tipoExcepcion;

	public ExcepcionNegocio() {
		super();
		tipoExcepcion = ERROR_DESCONOCIDO;
	}

	public ExcepcionNegocio(String mensaje) {
		super(mensaje);
		tipoExcepcion = ERROR_DESCONOCIDO;
	}

	public ExcepcionNegocio(String mensaje, int tipoExcepcion) {
		super(mensaje);
		this.tipoExcepcion = tipoExcepcion;
	}

	public ExcepcionNegocio(Exception excepcion, int tipoExcepcion) {
		super(excepcion.getMessage());
		this.tipoExcepcion = tipoExcepcion;
	}

	public int getTipoExcepcion() {
		return tipoExcepcion;
	}

}