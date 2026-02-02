package com.tnsif.interfaces;

class MyClass implements marker {
    void status() {
        System.out.println("Object is marked.");
    }
}

public class MarkerD {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        if (obj instanceof marker) {
            obj.status();
        }
    }
}