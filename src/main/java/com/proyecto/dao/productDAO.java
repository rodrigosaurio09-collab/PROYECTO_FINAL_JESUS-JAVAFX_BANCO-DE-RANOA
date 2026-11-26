package com.proyecto.dao;

//DAO = Data Access Object

//representa la conexión con mi DB
import java.sql.Connection;

//representa los errores en mi DB
import java.sql.SQLException;

//Prepara mis quierys antes de pasarlos a la DB
import java.sql.PreparedStatement;

//la que administra los resultados de la DB (lo que devuelve la DB con un SELECT)
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.proyecto.database.dbConnect;
import com.proyecto.models.Product;

public class productDAO {

    public boolean insertProduct (Product prd){

        String query = "INSERT INTO productos " + "(nombre, precio, cantidad) " + "VALUES(?,?,?)";

        try {

            Connection conn = dbConnect.connect();
            PreparedStatement ps = conn.prepareStatement(query);

            //inyectando datos a query

            ps.setString(1,prd.getName());
            ps.setDouble(2,prd.getPrice());
            ps.setInt(3,prd.getQuantity());

            return ps.executeUpdate() > 0;

        }catch (SQLException e){
        System.out.println("FALLO AL INSERTAR PRODUCTO");
        e.printStackTrace();
        return false;

        }
    
    }

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        String query = "SELECT * PRODUCTOS ";


        try{

            Connection conn = dbConnect.connect();
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Product prd = new Product(rs.getInt("ID"), rs.getString("Nombre"), rs.getDouble("Precio"), rs.getInt("cantidad"));
                products.add(prd);

            }

        }catch(SQLException e) {

            System.out.println("FALLO LA CARGA DE PRODUCTOS");
            e.printStackTrace();
        }
        return products;

    }

    public boolean updateProduct(Product prd){
        String query = "UPDATE productos " + "SET nombre = ?" + "EHERE id = ?";
        try {

            Connection conn = dbConnect.connect();
            PreparedStatement ps = conn.prepareStatement(query);

            //inyectando datos a query

            ps.setString(1,prd.getName());
            ps.setDouble(2,prd.getPrice());
            ps.setInt(3,prd.getQuantity());
            ps.setInt(4,prd.getId());

            return ps.executeUpdate() > 0;

        }catch (SQLException e){
        System.out.println("FALLO AL ACTUALIZAR PRODUCTO");
        e.printStackTrace();
        return false;

        }
        
    }

}
