package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
public static void main(String[] args) {
	Employee e1 = new Employee(2,"Surya",89999);
	Employee e2 = new Employee(8,"Ankith",80000);
	Employee e3 = new Employee(1,"Manasa",78000);
	Employee e4 = new Employee(7,"Akash",67000);
	Employee e5 = new Employee(9,"Namratha",78800);
	Employee e6 = new Employee(5,"Shaminaz",50000);
	Employee e7 = new Employee(3,"Raise",90000);
	Employee e8 = new Employee(4,"Gogate",98000);
	Employee e9 = new Employee(6,"Maneesh",75000);
	
	ArrayList<Employee> e = new ArrayList<>();
	e.add(e1);
	e.add(e2);
	e.add(e3);
	
	ArrayList<Employee> em = new ArrayList<>();
	em.add(e4);
	em.add(e5);
	em.add(e6);
	
	ArrayList<Employee> em1 = new ArrayList<>();
	em1.add(e7);
	em1.add(e8);
	em1.add(e9);
	
	HashMap<String,ArrayList<Employee>> hm = new HashMap<>();
	hm.put("Manager1", e);
	hm.put("Manager2", em);
	hm.put("Manager3", em1);
	ArrayList<Employee> a = hm.get("Manager2");
	
	Iterator<Employee> it = a.iterator();
	while(it.hasNext()) {
	Employee emp= it.next();
		System.out.println("Id is "+emp.id);
		System.out.println("Name is "+emp.name);
		System.out.println("Salary is "+emp.salary);
		System.out.println("------------------");
}
}
}
