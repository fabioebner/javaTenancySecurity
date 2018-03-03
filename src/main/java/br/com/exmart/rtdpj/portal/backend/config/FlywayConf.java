package br.com.exmart.rtdpj.portal.backend.config;

import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by fabioebner on 26/05/17.
 */
@Component
public class FlywayConf {

    public void migrate(DataSource datasource, String locations, String... schema){
        Flyway flyway = new Flyway();
        flyway.setDataSource(datasource);
        flyway.setBaselineOnMigrate(false);
        flyway.setValidateOnMigrate(false);
        flyway.setSqlMigrationPrefix("V");
        flyway.setLocations(locations);
        flyway.setSchemas(schema);
        flyway.migrate();
    }

}
