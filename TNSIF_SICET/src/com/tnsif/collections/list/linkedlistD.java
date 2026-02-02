package com.tnsif.collections.list;
import java.util.LinkedList;

public class linkedlistD {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.addFirst(5);
        linkedList.addLast(20);
        System.out.println("LinkedList: " + linkedList);
    }
}