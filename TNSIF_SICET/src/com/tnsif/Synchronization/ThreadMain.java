package com.tnsif.Synchronization;

public class ThreadMain {
    public static void main(String[] args) {
        // One shared resource object
        ThreadDemo obj = new ThreadDemo();

        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.setName("Thread-Alpha");
        t2.setName("Thread-Beta");

        t1.start();
        t2.start();
    }
}