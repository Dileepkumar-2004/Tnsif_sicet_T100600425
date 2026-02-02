package com.tnsif.Inheritance.Single;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

public class SingleInherit extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}