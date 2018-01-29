#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.servicio;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import ${package}.util.ExcepcionNegocio;

@Repository
public class BatchSqlMapDao extends SqlMapClientDaoSupport implements BatchDao {
	
	/** Representa el log */
	private static Logger LOGGER = Logger.getLogger(BatchSqlMapDao.class.getName());
	
	@Autowired
	public BatchSqlMapDao(SqlMapClient sqlMapClient) {
		setSqlMapClient(sqlMapClient);
	}

	/* (non-Javadoc)
	 * @see ${package}.servicio.BatchDao${symbol_pound}dummy()
	 */
	public String dummy() throws ExcepcionNegocio {
		LOGGER.debug("dummy-->Inicio");
		try {
			return (String) getSqlMapClientTemplate().queryForObject("dummy");
		} catch (DataAccessException sqle) {
			LOGGER.error("Error en dummy: ", sqle);
			throw new ExcepcionNegocio(sqle, ExcepcionNegocio.ERROR_BD_RECUPERACION);
		} catch (Exception e) {
			LOGGER.error("Error en dummy: ", e);
			throw new ExcepcionNegocio(e, ExcepcionNegocio.ERROR_DESCONOCIDO);
		} finally {
			LOGGER.debug("dummy-->Fin");
		}
	}

}
