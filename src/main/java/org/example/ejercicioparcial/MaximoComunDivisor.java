package org.example.ejercicioparcial;

//Maximo Comun Divisor (MCD)
//Contexto: Calcula el MCD de dos numeros.
//Parametros: Dos enteros a y b.

public class MaximoComunDivisor {
    public static void main(String[] args) {
        int a = 56; // Primer número
        int b = 98; // Segundo número

        int mcd = maximoComunDivisor(a, b);
        System.out.printf("El MCD de %d y %d es %d%n", a, b, mcd);
    }

    public static int maximoComunDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return maximoComunDivisor(b, a % b);
    }
}