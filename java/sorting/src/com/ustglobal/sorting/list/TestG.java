package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
public static void main(String[] args) {
	 HashSet<Employee> hs = new HashSet<Employee>();
	 Employee e1 = new Employee(12,"Surya" ,890000);
	 Employee e2 = new Employee(15,"Manasa" ,90000);
	 Employee e3 = new Employee(13,"Ankith" ,780000);
	 Employee e4 = new Employee(10,"Akash" ,990000);
	 Employee e5 = new Employee(13,"Ankith" ,780000);
	 
	 hs.add(e1);
	 hs.add(e2);
	 hs.add(e3);
	 hs.add(e4);
	 hs.add(e5);
	 System.out.println("*****Using iterator****");
	 Iterator<Employee> it = hs.iterator();
	 while(it.hasNext()) {
		 
		 Employee e = it.next();
		 System.out.println("Id is" +e.id);
		 System.out.println("Name is" +e.name);
		 System.out.println("salary is" +e.salary);
		 
		 
		 
	 }
	 
	 
}
}
