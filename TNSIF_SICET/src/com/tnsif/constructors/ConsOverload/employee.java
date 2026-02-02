package com.tnsif.constructors.ConsOverload;

public class employee {
    private int id;
    private String name;
    private double salary;

    // Constructor with 2 parameters
    public employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    // Overloaded Constructor with 3 parameters
    public employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}