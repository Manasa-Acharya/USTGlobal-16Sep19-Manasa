package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestE {
public static void main(String[] args) {
	Supplier<Student> s = () ->new Student(2,"baaabu",78.9); 

Student s1 = s.get();
System.out.println("Id is " +s1.id);
System.out.println("Name is " +s1.name);
System.out.println("pernt is " +s1.percentage);

Supplier<Integer> i = () -> 20;
int val = i.get();
System.out.println("Value is "  +val);

Supplier<String> sp = () ->"good evening";
String v = sp.get();
System.out.println("Value " +v);
}
}


