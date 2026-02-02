package com.tnsif.Inheritance.Hierarichal;

public class HieraricalInheritD {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat(); // Both share the same parent method
    }
}