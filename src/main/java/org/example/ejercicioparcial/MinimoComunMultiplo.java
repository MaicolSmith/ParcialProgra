package org.example.ejercicioparcial;

//Mınimo Comun Multiplo (MCM)
//Contexto: Calcula el MCM de dos numeros.
//Parametros: Dos enteros a y b.

import java.util.Scanner;

public class MinimoComunMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt(); // Leer el primer número
        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt(); // Leer el segundo número

        int mcm = calculateMCM(a, b); // Calcular el MCM
        System.out.println("El MCM de " + a + " y " + b + " es: " + mcm);
    }

    // Método para calcular el MCM iterativamente
    public static int calculateMCM(int a, int b) {
        int max = Math.max(a, b); // Empieza desde el mayor de los dos números

        // Busca el primer múltiplo común
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max; // Debuelbe cuando max es divisible por ambos números
            }
            max++; // Incrementa para encontrar el siguiente múltiplo
        }
    }
}
