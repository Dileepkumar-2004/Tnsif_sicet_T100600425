package com.tnsif.exceptions;

public class ThrowsMechanism {
    
    // Method declares it might throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            // Calling the method that throws an exception
            checkAge(15);
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}