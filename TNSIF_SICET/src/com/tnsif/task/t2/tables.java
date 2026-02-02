package com.tnsif.task.t2;

public class tables {
    public static void main(String[] args) {
        int number = 5; // The number to print the table for
        
        System.out.println("Multiplication Table of " + number + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

