package com.tnsif.Encapsulation;

public class StudentD {

	
	    public static void main(String[] args) {
	        Student s = new Student();
	        s.setName("Alex");
	        s.setRollNo(101);

	        System.out.println("Student Name: " + s.getName());
	        System.out.println("Roll Number: " + s.getRollNo());
	    }
	}