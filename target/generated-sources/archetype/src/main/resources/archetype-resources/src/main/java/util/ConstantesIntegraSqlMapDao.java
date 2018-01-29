#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class ConstantesIntegraSqlMapDao extends SqlMapClientDaoSupport implements ConstantesIntegraDao{

	/** Representa el log */
	private static Logger LOGGER = Logger.getLogger(ConstantesIntegraSqlMapDao.class.getName());

	@Autowired
	public ConstantesIntegraSqlMapDao(SqlMapClient sqlMapClient) {
		setSqlMapClient(sqlMapClient);
	}

	/* (non-Javadoc)
	 * @see ${package}.util.ConstantesIntegraDao${symbol_pound}obtenerValorConstante(java.lang.String)
	 */
	public String obtenerValorConstante(String constante) throws ExcepcionNegocio{
		try {
			LOGGER.debug("obtenerValorConstante-->Inicio");
			//Recoge el valor de la constante mediante la consulta
			return (String)getSqlMapClientTemplate().queryForObject("obtenerValorConstante", constante);
		} catch (DataAccessException sqle) {
			LOGGER.error("Error en obtenerValorConstante: ", sqle);
			throw new ExcepcionNegocio(sqle, ExcepcionNegocio.ERROR_BD_RECUPERACION);
		} catch (Exception e) {
			LOGGER.error("Error en obtenerValorConstante: ", e);
			throw new ExcepcionNegocio(e, ExcepcionNegocio.ERROR_DESCONOCIDO);
		} finally {
			LOGGER.debug("obtenerValorConstante-->Fin");
		}
	}

	/* (non-Javadoc)
	 * @see ${package}.util.ConstantesIntegraDao${symbol_pound}obtenerValorSecuencia(java.lang.String)
	 */
	public Long obtenerValorSecuencia(String secuencia) throws ExcepcionNegocio {
		try {
			LOGGER.debug("obtenerValorSecuencia-->Inicio");
			//Recoge el valor de la constante mediante la consulta
			return (Long) getSqlMapClientTemplate().queryForObject("obtenerValorSecuencia", secuencia);
		} catch (DataAccessException sqle) {
			LOGGER.error("Error en obtenerValorSecuencia: ", sqle);
			throw new ExcepcionNegocio(sqle, ExcepcionNegocio.ERROR_BD_RECUPERACION);
		} catch (Exception e) {
			LOGGER.error("Error en obtenerValorSecuencia: ", e);
			throw new ExcepcionNegocio(e, ExcepcionNegocio.ERROR_DESCONOCIDO);
		} finally {
			LOGGER.debug("obtenerValorSecuencia-->Fin");
		}
	}
}
