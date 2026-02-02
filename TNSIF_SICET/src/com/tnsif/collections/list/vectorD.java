package com.tnsif.collections.list;
import java.util.Vector;

public class vectorD {
    public static void main(String[] args) {
        Vector<Double> vec = new Vector<>();
        vec.add(10.5);
        vec.add(20.5);
        System.out.println("Vector (Thread-safe): " + vec);
    }
}