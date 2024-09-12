package org.example.ejercicioparcial;

//Palındroma
//Contexto: Verifica si una cadena de texto es un palındromo.
//Parametro: Una cadena texto.


import java.util.Scanner;

public class Palindroma {

    // Método para verificar si una cadena es un palíndromo
    public static boolean esPalindroma(String texto) {
        // Convertir la cadena a minúsculas y eliminar espacios y caracteres no alfanuméricos
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Obtener la longitud de la cadena limpia
        int longitud = textoLimpio.length();

        // Verificar si la cadena es igual de adelante hacia atrás
        for (int i = 0; i < longitud / 2; i++) {
            if (textoLimpio.charAt(i) != textoLimpio.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String texto = scanner.nextLine();

        if (esPalindroma(texto)) {
            System.out.println("\"" + texto + "\" es una palíndroma.");
        } else {
            System.out.println("\"" + texto + "\" no es una palíndroma.");
        }

        scanner.close();
    }
}