package org.example.ejercicioparcial;

import java.util.Scanner;

package org.ciaf.claseciclosycondicionales02;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Convertir la temperatura a Fahrenheit
        double temperaturaFahrenheit = convertirACelsiusAFahrenheit(temperaturaCelsius);

        // Mostrar la temperatura en Fahrenheit
        System.out.println("La temperatura en Fahrenheit es: " + temperaturaFahrenheit);

        // Proporcionar recomendaciones
        proporcionarRecomendaciones(temperaturaFahrenheit);
    }

    // Método para convertir Celsius a Fahrenheit
    public static double convertirACelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para proporcionar recomendaciones basadas en la temperatura en Fahrenheit
    public static void proporcionarRecomendaciones(double fahrenheit) {
        if (fahrenheit > 77) { // Más de 25°C en Fahrenheit
            System.out.println("Hace calor. Te recomendamos usar ropa ligera y beber agua.");
        } else if (fahrenheit >= 50) { // Entre 10°C y 25°C en Fahrenheit
            System.out.println("El clima es agradable. Un suéter ligero podría ser útil.");
        } else { // Menos de 10°C en Fahrenheit
            System.out.println("Hace frío. Te recomendamos llevar un abrigo y una bufanda.");
        }
    }
}
