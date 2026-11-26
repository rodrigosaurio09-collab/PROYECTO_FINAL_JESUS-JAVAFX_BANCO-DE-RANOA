package com.proyecto.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
    
    //hay que cambiar el URL, USER y PASSWORD a los datos de tu base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/example";
    private static final String USER = "root";
    private static final String PASSWORD = "0920";
  
    public static Connection connect(){
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
            

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conn;


    }

    }
