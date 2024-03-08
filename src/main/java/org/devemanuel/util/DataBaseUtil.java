package org.devemanuel.util;

import org.postgresql.ds.PGSimpleDataSource;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
Clase que nos servira para poder obtener una co nexión a la base de datos.

Varias formas de poder obtener una conexión  hacia una base de datos
1.- De la forma mas habitual con DriverManager
2.- Una DataSource y podemos configurar un pool de conexiones con hikari cp
 */
public class DataBaseUtil {
    private final  static  String userDB =  "emanuel";
    private final static  String passwordDB = "pharsa13";
    private final static String urlDB = "jdbc:postgresql://localhost:5432/hotelDB";
    // conexion
    private static Connection connection;

    // metodo para conseguir una conexion
    public static Connection getconnection(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(urlDB,userDB,passwordDB);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
