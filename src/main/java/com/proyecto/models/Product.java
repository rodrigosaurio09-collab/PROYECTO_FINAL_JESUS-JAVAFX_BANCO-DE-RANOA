package com.proyecto.models;

public class Product {

    private int id;
    private String nombre;
    private double precio;
    private int cantidad;


//daros que bienen de DB
    public Product(int id, String name, double price, int quantity){

        this.id = id;;
        this.nombre = name;
        this.precio = price;
        this.cantidad = quantity;
    }

//datos que creo yo
    public Product(String name, double price, int quantity){

        this.nombre = name;
        this.precio = price;
        this.cantidad = quantity;
    }

    //getters y setters

    //ID
    public int getId(){
        return this.id;
    }
     public int setId(){
        return this.id;
    }

    //Name
    public String getName(){
        return this.nombre;
    }
    public String setName(){
        return this.nombre;
    }

    //price
    public double getprice(){
        return this.id;
    }
    public double setprice(){
        return this.id;
    }

    //quantity
    public int getQuantity(){
        return this.cantidad;
    }
    public int setQuantity(){
        return this.cantidad;
    }
}
