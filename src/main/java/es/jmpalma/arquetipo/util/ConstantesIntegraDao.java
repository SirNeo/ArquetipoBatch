package es.jmpalma.arquetipo.util;

public interface ConstantesIntegraDao {
	
	/**
	 * Método que recupera de la tabla LINCE_CONSTANTES 
	 *  el valor de la constante pasada como parametro
	 * @param constante
	 * @return String con el valor de la constante
	 * @throws ExcepcionNegocio
	 */
	String obtenerValorConstante(String constante) throws ExcepcionNegocio;
	
	/**
	 * Método encargado de recuperar el código secuencial
	 * @param secuencia
	 * @return
	 * @throws ExcepcionNegocio 
	 */
	Long obtenerValorSecuencia (String secuencia) throws ExcepcionNegocio;
	
}
