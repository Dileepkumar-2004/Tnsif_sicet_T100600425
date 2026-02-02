package com.tnsif.string;

public class stringexample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World";
        String s3 = s1.concat(s2);
        
        System.out.println("Concatenated: " + s3);
        System.out.println("Length: " + s3.length());
        System.out.println("Upper Case: " + s3.toUpperCase());
    }
}
