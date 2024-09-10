package org.example.ejercicioparcial;

// Numero Invertido
//Contexto: Dado un número n, invierte sus dígitos.
//Parámetro: Un entero n.
import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt(); // Leer el número ingresado por el usuario
        int numeroInvertido = 0; // Inicializamos el número invertido en 0

        // Invertir el número usando restos y divisiones
        while (n != 0) {
            int digito = n % 10; // Extraer el último dígito
            numeroInvertido = numeroInvertido * 10 + digito; // Construir el número invertido
            n = n / 10; // Reducir el número eliminando el último dígito
        }

        // Mostrar el número invertido
        System.out.println("Número invertido: " + numeroInvertido);
    }
}