
package org.example.ejercicioparcial;
// Suma de Numeros Pares
//Contexto: Dado un número n, se requiere sumar todos los números pares entre 1 y n.
//Parámetro: Un entero n.

import java.util.Scanner;

public class SumaDeNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta un número : ");
        int n = scanner.nextInt();  // que me empiece a leer desde n
        int suma = 0;  // Empesamos  la suma en 0
        int i = 1;  // Empesamos  el contador en 1

        //  Se Utiliza Bucle while para recorrer los números de 1 a n
        while (i <= n) {
            // Verificamos si el número es par
            if (i % 2 == 0) {
                suma += i;  // Si es par, lo sumamos al total
            }
            i++;  // Incrementamos el contador
        }

        // Resultado de  la suma total de los números pares
        System.out.println("La suma de los números pares entre 1 y " + n + " es: " + suma);
    }
}
