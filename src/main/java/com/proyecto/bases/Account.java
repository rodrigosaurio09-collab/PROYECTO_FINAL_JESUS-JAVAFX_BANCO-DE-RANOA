

//clase base, representa una cuenta bancaria, tiene un número de cuenta y un saldo.
//client dependerá de ella
 class Account {


    //private y final para que no se pueda modificar desde afuera, encapsulamiento
    //es el número de cuenta
    private final String AcNumber;

    //el saldo
    private double balance;

    //constructor
    public Account(String acNumber, double balance) {
        this.acNumber = acNumber;
        this.balance = balance;
    }

    //Métodos que returnean nada más, similar a User.java
    public String getNumber() {
        return acNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void add(double amount) {
        balance += amount;
    }

    public void subtract(double amount) {
        balance -= amount;
    }
}