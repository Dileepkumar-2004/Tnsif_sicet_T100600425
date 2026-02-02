package com.tnsif.collections.sets;
import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(10);
        ts.add(50);
        System.out.println("TreeSet (Sorted Order): " + ts);
    }
}
