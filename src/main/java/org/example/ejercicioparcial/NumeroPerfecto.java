package org.example.ejercicioparcial;

import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (esPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        scanner.close();
    }

    public static boolean esPerfecto(int numero) {
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma == numero;
    }
}