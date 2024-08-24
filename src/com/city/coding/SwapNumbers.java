package com.city.coding;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        
        // Swap using bitwise XOR operations
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
