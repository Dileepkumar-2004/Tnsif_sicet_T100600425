package com.tnsif.constructors.Parameterized;

public class student {
    private int id;
    private String name;

    // Parameterized Constructor
    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}