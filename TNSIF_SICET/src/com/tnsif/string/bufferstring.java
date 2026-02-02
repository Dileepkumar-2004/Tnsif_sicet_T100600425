package com.tnsif.string;

public class bufferstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb); // Hello Java
        
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
