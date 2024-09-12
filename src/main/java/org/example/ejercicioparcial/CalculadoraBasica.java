package org.example.ejercicioparcial;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();

        System.out.println("Ingrese la operación (+, -, *, /):");
        char operacion = scanner.next().charAt(0);

        int resultado = 0;
        switch (operacion) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        System.out.println("El resultado de " + a + " " + operacion + " " + b + " es: " + resultado);
    }
}
