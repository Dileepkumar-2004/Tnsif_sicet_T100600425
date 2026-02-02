package com.tnsif.Synchronization;

public class ThreadDemo {
    // A synchronized method to ensure thread safety
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (n * i));
            try {
                Thread.sleep(400); // Pause to demonstrate switch
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}