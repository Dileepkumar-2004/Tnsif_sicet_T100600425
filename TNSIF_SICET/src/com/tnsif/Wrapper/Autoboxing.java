package com.tnsif.Wrapper;

public class Autoboxing {
    public static void main(String[] args) {
        // Primitive data type
        int a = 20;

        Integer i = a; 

        System.out.println("Primitive Value: " + a);
        System.out.println("Wrapper Object Value: " + i);
        
        // Verifying it is an object
        if (i instanceof Integer) {
            System.out.println("Successfully converted to an Integer object.");
        }
    }
}