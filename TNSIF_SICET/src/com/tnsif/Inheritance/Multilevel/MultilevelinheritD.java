package com.tnsif.Inheritance.Multilevel;

public class MultilevelinheritD {
    public static void main(String[] args) {
        Multilevelinherit babyDog = new Multilevelinherit();
        babyDog.eat();  // From Grandparent
        babyDog.bark(); // From Parent
        babyDog.weep(); // Own
    }
}