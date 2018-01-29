package es.jmpalma.arquetipo.batch;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmpalma.arquetipo.servicio.ServicioBatch;
import es.jmpalma.arquetipo.util.ExcepcionNegocio;
import es.jmpalma.arquetipo.util.ServicioConstantesIntegra;

@Service
public class ServicioBatchPrincipal {
	
	private static final Logger LOGGER = Logger.getLogger(ServicioBatchPrincipal.class);

	@Autowired
	ServicioBatch servicio;
	
	@Autowired
	private ServicioConstantesIntegra constantesIntegra;
	
	@Deprecated
	public void prueba(){
		LOGGER.debug("Inicio");
		
		try {
			String prueba = servicio.dummy();

		} catch (ExcepcionNegocio e) {
			LOGGER.error("Error");
		}

		LOGGER.debug("Fin");
	}
	
}
