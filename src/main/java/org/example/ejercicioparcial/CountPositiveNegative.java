package org.example.ejercicioparcial;

import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        int countPositive = 0, countNegative = 0;
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 0) {
                countPositive++;
            } else if (numbers[i] < 0) {
                countNegative++;
            }
        }
        
        System.out.println("Total Positive Numbers: " + countPositive);
        System.out.println("Total Negative Numbers: " + countNegative);
    }
}