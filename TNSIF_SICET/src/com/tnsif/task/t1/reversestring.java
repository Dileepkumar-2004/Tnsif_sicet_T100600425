package com.tnsif.task.t1;

public class reversestring {
    public static void main(String[] args) {
        String str = "TNSIF";
        String reversed = "";
        
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
