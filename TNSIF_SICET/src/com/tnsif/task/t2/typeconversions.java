package com.tnsif.task.t2;

public class typeconversions {
    public static void main(String[] args) {
        
        // Implicit Casting (Widening): Small to Large
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        
        System.out.println("--- Implicit Casting ---");
        System.out.println("Integer value: " + myInt);      // Outputs 9
        System.out.println("Double value: " + myDouble);    // Outputs 9.0

        // Explicit Casting (Narrowing): Large to Small
        double d = 9.78;
        int i = (int) d; // Manual casting: double to int

        System.out.println("\n--- Explicit Casting ---");
        System.out.println("Double value: " + d);   // Outputs 9.78
        System.out.println("Integer value: " + i);  // Outputs 9
    }
}
