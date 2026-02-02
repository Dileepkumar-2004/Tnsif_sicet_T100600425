package com.tnsif.lamda;
import java.util.function.Supplier;

public class SupplierD {
    public static void main(String[] args) {
        Supplier<Double> getRandom = () -> Math.random();
        System.out.println("Random Value: " + getRandom.get());
    }
}