package com.barberia.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/barberia_db";
    private static final String USER = "root";
    private static final String PASSWORD = "#Btr80ak47f229mm52";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
