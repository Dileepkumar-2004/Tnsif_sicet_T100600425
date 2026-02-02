package com.tnsif.collections.sets;
import java.util.LinkedHashSet;

public class linkedhash {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("First");
        lhs.add("Second");
        System.out.println("LinkedHashSet: " + lhs);
    }
}