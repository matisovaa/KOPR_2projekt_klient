
package kopr.klient.implementacia;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import server.EvidenciaService;

public enum Factory {
    
    INSTANCE;
    private JdbcTemplate jdbcTemplate;
        
    public synchronized JdbcTemplate getJdbcTemplate() {
	if (jdbcTemplate == null) {
            MysqlDataSource dataSource;
            dataSource = new MysqlDataSource();
            
            // pristup k testovacej databaze
            dataSource.setDatabaseName("KOPR_evidencia_test");
            dataSource.setUser("administratorTest");
            dataSource.setPassword("admintest");
            jdbcTemplate = new JdbcTemplate(dataSource);
	}
	return jdbcTemplate;
    }

    public synchronized void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }    
}
