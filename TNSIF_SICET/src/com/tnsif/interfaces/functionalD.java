package com.tnsif.interfaces;

public class functionalD {
    public static void main(String[] args) {
        // Implementing using Lambda
        Functional f = (name) -> System.out.println("Hello, " + name);
        f.sayHello("Student");
    }
}