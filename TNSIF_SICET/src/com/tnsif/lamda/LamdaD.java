package com.tnsif.lamda;

interface MathOp {
    int operate(int a, int b);
}

public class LamdaD {
    public static void main(String[] args) {
        MathOp add = (a, b) -> a + b;
        System.out.println("Addition: " + add.operate(5, 3));
    }
}