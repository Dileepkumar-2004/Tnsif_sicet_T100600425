package com.tnsif.scanners;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Student Name: ");
        String name = sc.next(); 
        
        System.out.println("Student Details: [" + id + ", " + name + "]");
        sc.close();
    }
}
