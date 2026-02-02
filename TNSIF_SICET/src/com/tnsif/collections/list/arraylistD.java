package com.tnsif.collections.list;
import java.util.ArrayList;

public class arraylistD {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java"); // Duplicates allowed
        System.out.println("ArrayList: " + list);
    }
}