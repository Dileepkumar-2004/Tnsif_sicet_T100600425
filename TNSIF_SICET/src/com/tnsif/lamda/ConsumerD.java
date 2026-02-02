package com.tnsif.lamda;
import java.util.function.Consumer;

public class ConsumerD {
    public static void main(String[] args) {
        Consumer<String> display = (s) -> System.out.println("Value: " + s);
        display.accept("TNS India Foundation");
    }
}