package com.tnsif.Wrapper;

public class AutoUnboxing {
    public static void main(String[] args) {
        
        Integer i = Integer.valueOf(50);
        int a = i; 

        System.out.println("Wrapper Object Value: " + i);
        System.out.println("Primitive int Value: " + a);
        
        int result = i + 10; 
        System.out.println("Result after unboxing in expression: " + result);
    }
}