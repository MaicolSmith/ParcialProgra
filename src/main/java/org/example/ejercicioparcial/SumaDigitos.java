package org.example.ejercicioparcial;

import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int suma = sumaDeDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        scanner.close();
    }

    public static int sumaDeDigitos(int numero) {
        int suma = 0;

        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }
}