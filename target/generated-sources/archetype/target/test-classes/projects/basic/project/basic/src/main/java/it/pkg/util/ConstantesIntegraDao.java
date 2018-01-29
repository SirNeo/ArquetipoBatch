package it.pkg.util;

public interface ConstantesIntegraDao {
	
	/**
	 * M�todo que recupera de la tabla LINCE_CONSTANTES 
	 *  el valor de la constante pasada como parametro
	 * @param constante
	 * @return String con el valor de la constante
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
