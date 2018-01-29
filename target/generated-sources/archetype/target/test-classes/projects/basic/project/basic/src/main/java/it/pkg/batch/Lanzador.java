package it.pkg.batch;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Lanzador {
	
	private static final Logger LOGGER = Logger.getLogger(Lanzador.class);
	
	@Autowired
	ServicioBatchPrincipal pruebaPlantilla;
	
    /**
     * M�todo de entrada.
     * @param args
     */
    public static void main( String[] args ){
    	try {
    		LOGGER.info("INICIO DEL PROCESO BATCH");
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
			Lanzador lanzador = applicationContext.getBean(Lanzador.class);
			lanzador.iniciar();
			
		} catch (Exception e) {
			LOGGER.error("Se ha producido un error: ", e);
		} finally {
			LOGGER.info("FIN DEL PROCESO DEL BATCH");
		}
    }
    
    /**
     * M�todo encargado de lanzar las tareas del batch
     */
    private void iniciar(){
    
    	pruebaPlantilla.prueba();
    }
    
    
}
