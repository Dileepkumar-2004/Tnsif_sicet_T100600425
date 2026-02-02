package com.tnsif.nonaccessmodifiers.Static;

public class statickey {
    static int count = 0; // Shared among all objects

    statickey() {
        count++;
    }

    static void showCount() {
        System.out.println("Total Objects: " + count);
    }
}