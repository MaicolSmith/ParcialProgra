package org.example.ejercicioparcial;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int temp = number;
        
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        System.out.println("The number of digits in " + number + " is: " + count);
    }
}