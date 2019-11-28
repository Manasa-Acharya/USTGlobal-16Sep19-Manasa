package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;



public class TestI {
	public static void main(String[] args) {
//		SortByName sb = new SortByName();
//		SortByPincode sp = new SortByPincode();
		SortByMicr mi = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(mi);
		Bank b1 = new Bank("HDFC", 88,9999999);
		Bank b2 = new Bank("SBI", 89,8899999);
		Bank b3 = new Bank("Vijaya", 00,9009099);
		Bank b4 = new Bank("Canara", 67,00456);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("***using iterator****");
		
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("name is" + b.name);
			System.out.println("pincode is" + b.pincode);
			System.out.println("micr is" + b.micr);
			System.out.println("----------------------");
		}
		
	}
}
