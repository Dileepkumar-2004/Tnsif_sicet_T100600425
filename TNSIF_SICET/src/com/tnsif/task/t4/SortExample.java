package com.tnsif.task.t4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        System.out.println("Before Sorting: " + fruits);

        // Uses the natural ordering (Alphabetical)
        Collections.sort(fruits);

        System.out.println("After Sorting: " + fruits);
        
        // Bonus: Reverse sorting
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Reverse Sorting: " + fruits);
    }
}