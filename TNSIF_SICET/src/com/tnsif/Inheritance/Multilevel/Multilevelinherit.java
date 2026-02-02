package com.tnsif.Inheritance.Multilevel;

class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

public class Multilevelinherit extends Dog {
    void weep() { System.out.println("Weeping..."); }
}