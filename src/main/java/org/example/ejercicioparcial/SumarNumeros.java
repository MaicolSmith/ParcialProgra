package org.example.ejercicioparcial;

import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los números ingresados es: " + suma);
        scanner.close();
    }
}