package com.tnsif.Synchronization;

public class Thread2 extends Thread {
    ThreadDemo t;

    public Thread2(ThreadDemo t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}