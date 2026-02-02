package com.tnsif.polymorphism;

class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Calls Child's method
    }
}
