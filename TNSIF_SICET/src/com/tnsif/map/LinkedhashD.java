package com.tnsif.map;
import java.util.LinkedHashMap;

public class LinkedhashD {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
        lmap.put("One", 1);
        lmap.put("Two", 2);
        System.out.println("LinkedHashMap: " + lmap);
    }
}