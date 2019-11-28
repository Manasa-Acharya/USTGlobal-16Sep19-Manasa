package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
public static void main(String[] args) {
	
	LinkedList<Laptop>l1 = new LinkedList<Laptop>();
	
	Laptop lp1 = new Laptop(25000, 4 ,"lenovo");
	Laptop lp2 = new Laptop(35000, 6 ,"asus");
	Laptop lp3 = new Laptop(15000, 4 ,"hp");
	Laptop lp4 = new Laptop(105000, 6 ,"dell");
	
	l1.add(lp1);
	l1.add(lp2);
	l1.add(lp3);
	l1.add(lp4);
	l1.add(new Laptop(20000,2, "acer"));
	
	displayLaptopDetails(l1);
	Collections.sort(l1);
	displayLaptopDetails(l1);
}
	static void displayLaptopDetails(LinkedList<Laptop>l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("Brand is " + lp.name);
			System.out.println("price is " + lp.price);
			System.out.println("ram is " + lp.ram);
		}
		
	}
}

