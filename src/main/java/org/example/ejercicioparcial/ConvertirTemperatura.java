package org.example.ejercicioparcial;

import java.util.Scanner;

public class ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = convertirACelsius(celsius);
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");

        scanner.close();
    }

    public static double convertirACelsius(double celsius) {
        return (celsius * 9/5) + 32;
    }
}