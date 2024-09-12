package org.example.ejercicioparcial;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Count the number of words
        int wordCount = words.length;
        
        System.out.println("The number of words in the sentence is: " + wordCount);
    }
}
