#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

public interface ServicioConstantesIntegra {
	
	/**
	 * Recupera el valor de la constante indicada desde la tabla LINCE_CONSTANTES o LINCE_CONSTANTES_ENTORNO
	 * @param constante
	 * @return
	 * @throws ExcepcionNegocio 
	 */
	String obtenerValorConstante(String constante) throws ExcepcionNegocio;
	
	/**
	 * M�todo encargado de recuperar el c�digo secuencial
	 * @param secuencia
	 * @return
	 * @throws ExcepcionNegocio 
	 */
	Long obtenerValorSecuencia (String secuencia) throws ExcepcionNegocio;
	
}
