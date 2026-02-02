package com.tnsif.constructors.ConsOverload;

public class EmployeeD {
    public static void main(String[] args) {
        employee e1 = new employee(1, "Bob");
        employee e2 = new employee(2, "Charlie", 50000.0);

        e1.display();
        e2.display();
    }
}