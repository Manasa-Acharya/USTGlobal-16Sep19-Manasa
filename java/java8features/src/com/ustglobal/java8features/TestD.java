package com.ustglobal.java8features;

import java.util.function.Function;

public class TestD {
public static void main(String[] args) {
	Function<Integer , Student> f = id ->{
		Student s = new Student(2,"Ankith",89.90);
		s.id = id;
		return s;
		
	};
	Student s = f.apply(27);
	System.out.println("Id is " +s.id);
	System.out.println("Name is " +s.name);
	System.out.println("pernt is " +s.percentage);
	
}
}
