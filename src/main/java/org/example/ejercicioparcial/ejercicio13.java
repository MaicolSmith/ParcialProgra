package org.example.ejercicioparcial;

public class CalculadoraBasica {

    public class NumeroPerfecto {

        // Método para verificar si un número es perfecto
        public static boolean esNumeroPerfecto(int n) {
            if (n <= 1) {
                return false;
            }

            int sumaDivisores = 0;


            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sumaDivisores += i;
                }
            }


            return sumaDivisores == n;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un número entero: ");
            int n = scanner.nextInt();

            if (esNumeroPerfecto(n)) {
                System.out.println(n + " es un número perfecto.");
            } else {
                System.out.println(n + " no es un número perfecto.");
            }

            scanner.close();
        }
    }
}

