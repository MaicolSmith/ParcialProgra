package org.example.ejercicioparcial;

import java.util.Scanner;

public class PiramideAsterisco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de niveles: ");
        int niveles = scanner.nextInt();

        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= niveles - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}