package com.tnsif.task.t3;

public class nestedtry { // Renamed to PascalCase
    public static void main(String[] args) {
        // Declare variables outside to solve the "not defined" scope issue
        int result = 0;
        int[] numbers = new int[5];

        try {
            // Inner try block 1: Math operations
            try {
                System.out.println("Attempting division...");
                result = 39 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch 1: cannot divide by zero. Setting default result to 0.");
                result = 0; 
            }

            // Inner try block 2: Array operations
            try {
                System.out.println("Attempting array access...");
                numbers[4] = 100; // Fixed index (4 is valid for size 5)
                // numbers[5] = 4; // This would still trigger the catch
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch 2: Index out of bounds!");
            }

            System.out.println("End of outer try block. Result is: " + result);

        } catch (Exception e) {
            // Safety net for unexpected errors (NullPointer, etc.)
            System.out.println("Outer Catch: An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block: This always runs (useful for closing files/scanners).");
        }
        
        System.out.println("Rest of the code flows normally...");
    }
}
