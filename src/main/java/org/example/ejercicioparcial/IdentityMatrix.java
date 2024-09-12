package org.example.ejercicioparcial;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the identity matrix: ");
        int n = scanner.nextInt();
        
        int[][] identityMatrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    identityMatrix[i][j] = 1;
                } else {
                    identityMatrix[i][j] = 0;
                }
            }
        }
        
        System.out.println("The identity matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(identityMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}