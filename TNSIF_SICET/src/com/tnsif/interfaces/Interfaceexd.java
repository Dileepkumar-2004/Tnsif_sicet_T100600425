package com.tnsif.interfaces;

class InterfaceImpl implements Interfaceex {
    @Override
    public void show() {
        System.out.println("Implementation of standard interface.");
    }
}

public class Interfaceexd {
    public static void main(String[] args) {
        InterfaceImpl obj = new InterfaceImpl();
        obj.show();
    }
}