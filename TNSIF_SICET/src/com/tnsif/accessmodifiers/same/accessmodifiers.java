package com.tnsif.accessmodifiers.same;

public class accessmodifiers {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void display() {
        System.out.println("Accessing all from same class:");
        System.out.println(publicVar + " " + protectedVar + " " + defaultVar + " " + privateVar);
    }
}