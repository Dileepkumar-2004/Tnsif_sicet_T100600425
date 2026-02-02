package com.tnsif.task.t4;

import java.util.TreeMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // TreeMap sorts entries by Key naturally
        Map<Integer, String> students = new TreeMap<>();

        students.put(103, "Zara");
        students.put(101, "Aman");
        students.put(105, "Rahul");
        students.put(102, "Bina");

        System.out.println("Sorted Student Map (by ID):");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}