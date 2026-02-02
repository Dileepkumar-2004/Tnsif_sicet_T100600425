package com.tnsif.Threads.implements_Runnable;

public class RunnableRunner {
    public static void main(String[] args) {
        Runnabletask task = new Runnabletask();
        
        // Pass the runnable object to the Thread constructor
        Thread t1 = new Thread(task);
        t1.start();
    }
}