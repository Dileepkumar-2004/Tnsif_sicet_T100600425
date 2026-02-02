package com.tnsif.lamda;
import java.util.function.Predicate;

public class PredicateD {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
    }
}