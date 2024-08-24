package com.city.coding;

public class StringReverseProgram {
    public static void main(String[] args) {
        // Sample input string
        String input = "Hello, World!";
        
        // Reverse the string
        String reversed = reverseString(input);
        
        // Print the reversed string
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        // Swap characters from both ends
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        // Create a new string from the reversed character array
        return new String(charArray);
    }
}

