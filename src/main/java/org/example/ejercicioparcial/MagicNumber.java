package org.example.ejercicioparcial;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isMagic(number)) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }
    }
    
    public static boolean isMagic(int n) {
        int sum = 0;
        
        // Repeat until we get a single digit
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        
        return (sum == 1);
    }
}