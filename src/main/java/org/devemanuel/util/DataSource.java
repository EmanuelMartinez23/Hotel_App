package org.devemanuel.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/*
Crearemos una instancia de una fuente de datos con el DataSource de hikari cp
 */
public class DataSource {
    // las configuraciones que va tener la fuente de datos
    private  static HikariConfig config =  new HikariConfig();
    // la instancia de la datasource
    private  static HikariDataSource dataSource;

    static {
        // configuramos nuestros valores al objeto Hikari config
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/hotelDB");
        config.setUsername("emanuel");
        config.setPassword("pharsa13");
        config.setMaximumPoolSize(10);
        // creamos con la configuración la datasource
        dataSource = new HikariDataSource(config);

    }
    // metodo para conseguir una conexión del pool
    public static Connection getConnection(){
        // devolvemos una connexión
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
