import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para la tabla de multiplicar: ");

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            imprimirTabla(numero);
        } else {
            System.out.println("Por favor, introduce un número entero válido.");
        }

        scanner.close();
    }

    public static void imprimirTabla(int numero) {
        System.out.println("Tabla de multiplicar del número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numero, i, numero * i);
            System.out.println(linea);
        }
    }
}
