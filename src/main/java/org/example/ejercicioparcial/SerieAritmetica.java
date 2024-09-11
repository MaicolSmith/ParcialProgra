package org.example.ejercicioparcial;

//Serie Aritmetica
//Contexto: Calcula la suma de los primeros n terminos de una serie aritmetica
//con una diferencia comun d.
//Parametros: Tres enteros n, a (primer termino), y d (diferencia comun).

import java.util.Scanner;

public class SerieAritmetica {

    // Método para calcular la suma de los primeros n términos de una serie aritmética usando un bucle
    public static int sumaSerieAritmetica(int n, int a, int d) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += a + i * d;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los parámetros al usuario
        System.out.print("Introduce el número de términos (n): ");
        int n = scanner.nextInt();

        System.out.print("Introduce el primer término (a): ");
        int a = scanner.nextInt();

        System.out.print("Introduce la diferencia común (d): ");
        int d = scanner.nextInt();

        // Calcular la suma de la serie aritmética
        int suma = sumaSerieAritmetica(n, a, d);

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + n + " términos de la serie aritmética es: " + suma);

        scanner.close();
    }
}