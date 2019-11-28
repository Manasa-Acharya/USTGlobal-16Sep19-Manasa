package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
public static void main(String[] args) {
	Student s1 = new Student(2,"Surya",78.88);
	Student s2 = new Student(8,"Ankith",98.8);
	Student s3 = new Student(1,"Manasa",89.98);
	Student s4 = new Student(7,"Akash",59.78);
	Student s5 = new Student(9,"Namratha",77.88);
	Student s6 = new Student(5,"Shaminaz",39.56);
	Student s7 = new Student(3,"Raise",67.67);
	Student s8 = new Student(4,"Gogate",78.56);
	Student s9 = new Student(6,"Maneesh",90.99);
	
	
	ArrayList<Student> a1 = new ArrayList<>();
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	
	ArrayList<Student> a11 = new ArrayList<>();
	a11.add(s4);
	a11.add(s5);
	a11.add(s6);
	
	ArrayList<Student> a12 = new ArrayList<>();
	a12.add(s7);
	a12.add(s8);
	a12.add(s9);
	
	HashMap<String,ArrayList<Student>> hm = new HashMap<>();
hm.put("First", a1);
hm.put("Second", a11);
hm.put("Third", a12);
ArrayList<Student> first = hm.get("Second");

Iterator<Student> it = first.iterator();
while(it.hasNext()) {
	Student s= it.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("perc is "+s.percentage);
	System.out.println("------------------");
}

}

	
	
}

