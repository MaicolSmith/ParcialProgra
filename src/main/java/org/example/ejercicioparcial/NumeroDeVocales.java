package org.example.ejercicioparcial;
//Contador de Vocales
//Contexto: Cuenta cuántas vocales tiene una cadena de texto ingresada. Parametro: Una cadena de texto.

import java.util.Scanner;

public class NumeroDeVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una tu texto: ");
        String texto = scanner.nextLine(); // Lee la cadena o texto ingresada por el usuario

        int contadorVocales = 0; // Empesamos el contador total de vocales

        // Recorremos cada carácter de la cadena
        for (char caracter : texto.toLowerCase().toCharArray()) {
            // Si el carácter es una vocal, aumentamos  el contador total
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        // Se muestra la cantidad total de vocales
        System.out.println("Tu texto tiene  " + contadorVocales + " vocales.");
    }
}