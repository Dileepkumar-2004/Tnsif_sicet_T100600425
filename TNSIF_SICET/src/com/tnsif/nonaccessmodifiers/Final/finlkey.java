package com.tnsif.nonaccessmodifiers.Final;

public class finlkey {
    // Final variable
    final int limit = 100;

    void display() {
        // limit = 200; // This would cause a compilation error
        System.out.println("Limit is: " + limit);
    }
}