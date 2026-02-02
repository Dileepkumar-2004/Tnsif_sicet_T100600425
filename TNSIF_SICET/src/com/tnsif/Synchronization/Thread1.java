package com.tnsif.Synchronization;

public class Thread1 extends Thread {
    ThreadDemo t;

    public Thread1(ThreadDemo t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}