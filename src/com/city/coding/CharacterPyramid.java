package com.city.coding;

public class CharacterPyramid {
    public static void main(String[] args) {
        // Number of rows for the pyramid
        int rows = 5;
        
        // Character to use in the pyramid
        char pyramidChar = '*';
        
        // Generate the pyramid
        printPyramid(rows, pyramidChar);
    }
    
    // Method to print the pyramid
    public static void printPyramid(int rows, char pyramidChar) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for each row
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            
            // Print the pyramid characters
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(pyramidChar);
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
