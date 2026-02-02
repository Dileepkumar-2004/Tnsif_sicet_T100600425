package com.tnsif.collections.queue;
import java.util.PriorityQueue;

public class priorityqueueD {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);
        // Elements are retrieved in natural sorted order
        System.out.println("PriorityQueue (Smallest first): " + pq.poll());
    }
}