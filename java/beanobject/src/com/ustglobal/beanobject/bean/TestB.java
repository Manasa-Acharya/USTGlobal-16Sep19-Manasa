package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
public static void main(String[] args) {
	System.out.println("Scanner class");
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter age");
	int age = sc.nextInt();
	System.out.println("Age is" +age);
	System.out.println("-----------------");
	
	System.out.println("Enter Name");
	String name = sc.next();
	System.out.println("Name is" +name);
	System.out.println("-----------------");
	
	System.out.println("Enter Colleg Name");
	String clgname = sc.next();
	System.out.println("College Name is" +clgname);
	System.out.println("-----------------");
	
	System.out.println("Enter Salary");
	double salary = sc.nextDouble();
	System.out.println("Salary is" +salary);
	System.out.println("-----------------");
	
	System.out.println("R u intrested");
	boolean ans = sc.nextBoolean();
	System.out.println("yes or no  is" +ans);
	System.out.println("-----------------");
}
}
