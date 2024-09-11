package org.example.ejercicioparcial;

// Secuencia Fibonacci
//Contexto: Genera los primeros n terminos de la secuencia de Fibonacci.
//Parametro: Un entero n.


import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero de terminos de Fibonacci: ");
        int n = scanner.nextInt(); // Lee y muestra al usuario

        if (n <= 0) {
            System.out.println("Por favor, introduce un número mayor que 0.");
        } else {
            int[] fibonacciSequence = generateFibonacci(n); // Se llama al método para generar la secuencia
            System.out.print("Secuencia de Fibonacci: ");
            for (int num : fibonacciSequence) { // Imprimir la secuencia generada
                System.out.print(num + " ");
            }
        }
    }

    public static int[] generateFibonacci(int n) {
        int[] sequence = new int[n]; // Crea un arreglo para almacenar los términos
        if (n > 0) sequence[0] = 0; // El primer término es 0
        if (n > 1) sequence[1] = 1; // El segundo término es 1

        for (int i = 2; i < n; i++) { // Se empiesa   desde el tercer numero
            sequence[i] = sequence[i - 1] + sequence[i - 2]; // Calcula cada numero como la suma de los dos anteriores
        }

        return sequence; // Devuelve el arreglo con la secuencia completa
    }
}
