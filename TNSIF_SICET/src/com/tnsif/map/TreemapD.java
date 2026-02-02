package com.tnsif.map;
import java.util.TreeMap;

public class TreemapD {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(103, "Charlie");
        tmap.put(101, "Alice");
        tmap.put(102, "Bob");
        System.out.println("TreeMap (Sorted): " + tmap);
    }
}