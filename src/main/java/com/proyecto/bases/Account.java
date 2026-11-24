package com.proyecto.bases;

import java.util.ArrayList;
import java.util.List;

//clase base, representa una cuenta bancaria, tiene un número de cuenta y un saldo.
//client dependerá de ella
 class Account {


    //private y final para que no se pueda modificar desde afuera, encapsulamiento
    //es el número de cuenta
    private final String acNumber;

    //el saldo
    private double balance;

    //apenas y entiendo el Arraylist
    //debería almacenar el movimiento de la cuenta, pero no sé si lo vamos a usar
    private final List<Movement> history = new ArrayList<>();

    //constructor
    public Account(String acNumber, double balance) {
        this.acNumber = acNumber;
        this.balance = balance;
    }

    //Métodos que returnean nada más, similar a User.java

    //devuelve el número de cuenta
    public String getNumber() {
        return acNumber;
    }

    //devuelve el saldo en cuenta
    public double getBalance() {
        return balance;
    }

    //añade saldo y suma un movimiento
    public void add(double amount) {
        balance += amount;
        history.add(movement)
    }

    //quita saldo y suma un movimiento
    public void subtract(double amount) {
        balance -= amount;
                history.add(movement)

    }
}