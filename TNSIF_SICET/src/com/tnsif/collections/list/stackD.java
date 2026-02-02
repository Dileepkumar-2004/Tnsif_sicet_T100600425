package com.tnsif.collections.list;
import java.util.Stack;

public class stackD {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}