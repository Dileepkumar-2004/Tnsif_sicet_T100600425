package com.tnsif.Threads.Extends_Thread;

public class threadRunner {
    public static void main(String[] args) {
        Threadtask t1 = new Threadtask();
        // start() creates a new call stack and invokes run()
        t1.start(); 
    }
}