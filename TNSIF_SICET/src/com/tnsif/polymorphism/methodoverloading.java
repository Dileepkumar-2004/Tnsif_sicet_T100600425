package com.tnsif.polymorphism;

public class methodoverloading {
    
    // Method with 2 parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method with 3 parameters (Overloading)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        System.out.println("Sum (2 args): " + obj.add(10, 20));
        System.out.println("Sum (3 args): " + obj.add(10, 20, 30));
    }
}
