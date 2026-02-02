package com.tnsif.Inheritance.Single;

public class SingleInheritD {
    public static void main(String[] args) {
        SingleInherit dog = new SingleInherit();
        dog.eat();  // Inherited method
        dog.bark(); // Own method
    }
}