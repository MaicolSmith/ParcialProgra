package org.example.ejercicioparcial;

// Número Primo
//Contexto: Verifica si un número dado no es primo.
//Parámetro: Un entero n.
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();  // Leer el número n
        boolean noEsPrimo = false;  // Asumimos que el número es primo inicialmente

        // Si el número es menor o igual a 1, automáticamente no es primo
        if (n <= 1) {
            noEsPrimo = true;
        } else {
            // Verificamos si n tiene divisores distintos de 1 y él mismo
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {  // Si encontramos un divisor, no es primo
                    noEsPrimo = true;
                    break;  // Rompemos el bucle
                }
            }
        }

        // Mostrar el resultado
        if (noEsPrimo) {
            System.out.println(n + " no es un número primo.");
        } else {
            System.out.println(n + " es un número primo.");
        }
    }
}
