package com.ustglobalcollectionframework.list;

import java.util.ArrayList;

public class TestJ {
public static void main(String[] args) {
	ArrayList<Student>a1 = new ArrayList<Student>();
	Student s1 = new Student(101, "Ankith", 44.44);
	Student s2 = new Student(102, "Baabu", 33.44);
	Student s3 = new Student(103, "Munna", 89.44);
	
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	
	for(int i = 0; i <a1.size(); i++) {
		Student s = a1.get(i);
		System.out.println("Id is" + s.id);
		System.out.println("Name is" + s.name);
		System.out.println("per is" + s.percentage);
		
	}
	System.out.println("====== for each===");
	for(Student s : a1) { 
		System.out.println(s);
	}
	
	
}
}
