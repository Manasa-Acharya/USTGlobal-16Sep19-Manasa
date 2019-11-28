package com.ustglobal.sorting.list;

import java.util.TreeSet;
import java.util.Iterator;

public class TestJ {
	public static void main(String[] args) {
		SortByName1 sb1 = new SortByName1();
	
		 TreeSet<Customer> hs = new TreeSet<Customer>(sb1);
		 Customer c1 = new Customer(12,"Surya" ,890000);
		 Customer c2 = new Customer(15,"Manasa" ,90000);
		 Customer c3 = new Customer(13,"Ankith" ,780000);
		 Customer c4 = new Customer(10,"Akash" ,990000);
//		 Employee e5 = new Employee(13,"Ankith" ,780000);
		 
		 hs.add(c1);
		 hs.add(c2);
		 hs.add(c3);
		 hs.add(c4);
//		 hs.add(e5);
		 System.out.println("*****Using iterator****");
		 Iterator<Customer> it = hs.iterator();
		 while(it.hasNext()) {
			 
			 Customer c = it.next();
			 System.out.println("Id is" +c.id);
			 System.out.println("Name is" +c.name);
			 System.out.println("salary is" +c.salary);
			 System.out.println("---------------------");
}
	}
}

