package com.tnsif.collections.queue;
import java.util.LinkedList;
import java.util.Queue;

public class queueD {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("One");
        q.add("Two");
        System.out.println("Queue Head: " + q.peek());
    }
}