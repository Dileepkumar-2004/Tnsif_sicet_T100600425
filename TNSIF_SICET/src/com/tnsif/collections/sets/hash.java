package com.tnsif.collections.sets;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Apple"); // Ignored
        set.add("Orange");
        System.out.println("HashSet (Unordered): " + set);
    }
}