package com.mycompany.newpackage;

public class Calculadora {

    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    public Double dividir(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        }
        
        return null;
    }
}
