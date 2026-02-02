package com.tnsif.constructors.Default;

public class person {
    private String name;
    private int age;

    // Default Constructor
    public person() {
        System.out.println("Default constructor called");
        name = "Unknown";
        age = 0;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}