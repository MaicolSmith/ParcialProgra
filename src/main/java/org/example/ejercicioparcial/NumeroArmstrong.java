package org.example.ejercicioparcial;

import java.util.Scanner;

public class NumeroArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (esArmstrong(numero)) {
            System.out.println(numero + " es un número Armstrong.");
        } else {
            System.out.println(numero + " no es un número Armstrong.");
        }

        scanner.close();
    }

    public static boolean esArmstrong(int numero) {
        int suma = 0;
        int temp = numero;
        int digitos = String.valueOf(numero).length();

        while (temp != 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, digitos);
            temp /= 10;
        }

        return suma == numero;
    }
}