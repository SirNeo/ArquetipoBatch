#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.servicio;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package}.batch.ServicioBatchPrincipal;
import ${package}.util.ExcepcionNegocio;

@Service
@Transactional
public class ServicioBatchImpl implements ServicioBatch {

	private static final Logger LOGGER = Logger.getLogger(ServicioBatchImpl.class);
	
	/**
	 * Instancia del Dao en el servicio
	 * @see BatchDao
	 */
	@Autowired
	private BatchDao dao;
	
	/* (non-Javadoc)
	 * @see ${package}.servicio.ServicioBatch${symbol_pound}dummy()
	 */
	public String dummy() throws ExcepcionNegocio {
		LOGGER.debug("dummy-->Inicio");
		try {
			return dao.dummy();
		} catch (ExcepcionNegocio e) {
			LOGGER.debug("Error en dummy");
			throw e;
		} catch (Exception e) {
			LOGGER.error("Error en dummy");
			throw new ExcepcionNegocio( e, ExcepcionNegocio.ERROR_DESCONOCIDO);
		} finally {
			LOGGER.debug("dummy-->Fin");	
		}
	}

}
