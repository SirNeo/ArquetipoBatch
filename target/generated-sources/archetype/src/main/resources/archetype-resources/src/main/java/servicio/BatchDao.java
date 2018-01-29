#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.servicio;

import ${package}.util.ExcepcionNegocio;

public interface BatchDao {

	/**
	 * M�todo dummy.
	 * @return
	 * @throws ExcepcionNegocio
	 */
	@Deprecated
	String dummy() throws ExcepcionNegocio;
}
