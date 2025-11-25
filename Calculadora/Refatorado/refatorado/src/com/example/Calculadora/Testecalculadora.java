package com.example.Calculadora;

public class Testecalculadora {

    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        System.out.println(c.calc(10, 5, "+")); 
        System.out.println(c.calc(10, 5, "-")); 
        System.out.println(c.calc(10, 5, "*")); 
        System.out.println(c.calc(10, 5, "/")); 
    }
}
