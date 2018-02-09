
package kopr.klient.implementacia;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import server.EvidenciaService;
import server.EvidenciaServiceService;
import org.springframework.jdbc.core.JdbcTemplate;

public enum Factory {
    
    INSTANCE;
    private JdbcTemplate jdbcTemplate;
    private EvidenciaService evidenciaService;
        
    public JdbcTemplate getJdbcTemplate() {
	if (jdbcTemplate == null) {
            MysqlDataSource dataSource;
            dataSource = new MysqlDataSource();
            /*
            dataSource.setDatabaseName("KOPR_evidencia");
            dataSource.setUser("administrator");
            dataSource.setPassword("admin1");
            */
            dataSource.setDatabaseName("KOPR_evidencia_test");
            dataSource.setUser("administratorTest");
            dataSource.setPassword("admintest");
            jdbcTemplate = new JdbcTemplate(dataSource);
	}
	return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }   
    
    public EvidenciaService getEvidenciaService() {
	if (evidenciaService == null) {
            EvidenciaServiceService factory = new EvidenciaServiceService();
            evidenciaService = factory.getEvidenciaServicePort();            
	}
	return evidenciaService;
    }
    
}
