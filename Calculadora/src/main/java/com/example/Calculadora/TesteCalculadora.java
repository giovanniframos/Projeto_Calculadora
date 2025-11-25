package com.example.Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        CalculadoraApplication c = new CalculadoraApplication();

        System.out.println(c.calc(10, 5, "+")); // Esperado: 15
        System.out.println(c.calc(10, 5, "-")); // Esperado: 5
        System.out.println(c.calc(10, 5, "*")); // Esperado: 50
        System.out.println(c.calc(10, 5, "/")); // Esperado: 2
    }
}
