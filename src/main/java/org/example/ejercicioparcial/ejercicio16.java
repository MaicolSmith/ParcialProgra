package org.example.ejercicioparcial;

public class ejercicio16 {
}
import java.util.Scanner;

public class NumeroArmstrong {

    // Método para verificar si un número es un número Armstrong
    public static boolean esNumeroArmstrong(int n) {
        // Convertir el número a una cadena para procesar los dígitos
        String numeroStr = Integer.toString(n);
        int numDigitos = numeroStr.length();
        int suma = 0;
        int numero = n;

        // Calcular la suma de los dígitos elevados a la potencia del número de dígitos
        while (numero > 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, numDigitos);
            numero /= 10;
        }

        // Verificar si la suma es igual al número original
        return suma == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = scanner.nextInt();

        if (esNumeroArmstrong(n)) {
            System.out.println(n + " es un número Armstrong.");
        } else {
            System.out.println(n + " no es un número Armstrong.");
        }

        scanner.close();
    }
}
