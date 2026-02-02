package com.tnsif.exceptions;

public class TrycatchMechanism {
    public static void main(String[] args) {
        int a = 10, b = 0;
        
        try {
            // This will throw an ArithmeticException (division by zero)
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block: This always executes.");
        }
        
        System.out.println("Program continues...");
    }
}