#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.servicio;

import ${package}.util.ExcepcionNegocio;

public interface ServicioBatch {

	@Deprecated
	String dummy() throws ExcepcionNegocio;
}
