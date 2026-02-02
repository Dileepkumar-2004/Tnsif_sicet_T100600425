package com.tnsif.accessmodifiers.same;

public class accessmodifiersD {
    public static void main(String[] args) {
        accessmodifiers obj = new accessmodifiers();
        
        System.out.println("--- Accessing from Driver Class (Same Package) ---");
        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);
        // System.out.println(obj.privateVar); // Compile Error: private not visible
        
        obj.display();
    }
}