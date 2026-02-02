package com.tnsif.Inheritance.Hybrid;

class GrandParent {
    void showGP() { System.out.println("GrandParent Class"); }
}

interface Parent1 {
    void showP1();
}

public class HybridInherit extends GrandParent implements Parent1 {
    public void showP1() {
        System.out.println("Parent1 Interface implementation");
    }
}