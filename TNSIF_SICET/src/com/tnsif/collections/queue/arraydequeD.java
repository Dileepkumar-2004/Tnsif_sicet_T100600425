package com.tnsif.collections.queue;
import java.util.ArrayDeque;

public class arraydequeD {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.addFirst("Front");
        adq.addLast("Back");
        System.out.println("ArrayDeque: " + adq);
    }
}