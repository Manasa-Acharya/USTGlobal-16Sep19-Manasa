package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	
	Comparator<Employee>comp = (e1,e2) -> { 
		if(e1.id>e2.id) {
			return 1;
		}else if(e1.id<e2.id) {
			return -1;
		}else {
			return 0;
		}
	};
	TreeSet<Employee> ts = new TreeSet<Employee>(comp);
	
	Employee e1 = new Employee(4, "surya",5.8);
	Employee e2 = new Employee(1, "Tejaswi",5.6);
	Employee e3 = new Employee(6, "Manasa",5.0);
	Employee e4 = new Employee(7, "Ankith",5.6);
	
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	
	System.out.println("-----Using iterator-----");
	Iterator<Employee> it = ts.iterator();
	while(it.hasNext()) {
		Employee e=  it.next();
		System.out.println("name is " +e.name);
		System.out.println("id is " +e.id);
		System.out.println("Height is " +e.height);
		System.out.println("----------------");
		
		
		
	}
	
}
}
