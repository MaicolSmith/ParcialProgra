package org.example.ejercicioparcial;

//Factorial de un Numero
//Contexto: Calcula el factorial de un número dado n.
//Parámetro: Un entero n.

public class Factorial {
    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int n = 5; // ejemplo con n = 5
        int resultado = factorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }
}
