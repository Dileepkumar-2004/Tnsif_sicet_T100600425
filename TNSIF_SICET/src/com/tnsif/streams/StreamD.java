package com.tnsif.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamD {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "C++", "JavaScript");

        // Creating a stream and performing operations
        System.out.println("Names starting with 'J':");
        names.stream()
             .filter(name -> name.startsWith("J"))
             .map(String::toUpperCase)
             .forEach(System.out::println);

        // Example with integers
        Stream<Integer> stream = Stream.of(10, 20, 30, 40);
        System.out.println("Count of elements: " + stream.count());
    }
}