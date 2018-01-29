package es.jmpalma.arquetipo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioConstantesIntegraImpl implements ServicioConstantesIntegra {

	/**
	 * Instancia del Dao en el servicio
	 * @see ConstantesIntegraDao
	 */
	@Autowired
	private ConstantesIntegraDao constantesIntegraDao;

	/* (non-Javadoc)
	 * @see es.jmpalma.arquetipo.util.ServicioConstantesIntegra#obtenerValorConstante(java.lang.String)
	 */
	public String obtenerValorConstante(String constante) throws ExcepcionNegocio{
		return constantesIntegraDao.obtenerValorConstante(constante);
	}

	/* (non-Javadoc)
	 * @see es.jmpalma.arquetipo.util.ServicioConstantesIntegra#obtenerValorSecuencia(java.lang.String)
	 */
	public Long obtenerValorSecuencia(String secuencia) throws ExcepcionNegocio {
		return constantesIntegraDao.obtenerValorSecuencia(secuencia);
	}

	public void setConstantesIntegraDao(ConstantesIntegraDao constantesIntegraDao) {
		this.constantesIntegraDao = constantesIntegraDao;
	}

	public ConstantesIntegraDao getConstantesIntegraDao(){
		return this.constantesIntegraDao;
	}
}
