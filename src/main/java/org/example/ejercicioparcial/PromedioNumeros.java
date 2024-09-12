package org.example.ejercicioparcial;

import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números: ");
        int cantidad = scanner.nextInt();

        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double promedio = suma / cantidad;
        System.out.println("El promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}