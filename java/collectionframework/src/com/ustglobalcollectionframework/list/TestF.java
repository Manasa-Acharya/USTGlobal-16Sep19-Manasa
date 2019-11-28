package com.ustglobalcollectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("anu");
	a1.add("surya");
	a1.add("teju");
	a1.add("ashu");
	
	String name  = a1.get(1);
	System.out.println(name.toUpperCase());
	
	Iterator<String>li = a1.iterator();
	while(li.hasNext()) {
		String s = li.next();
		System.out.println(s);
	}
	
	
	System.out.println("-------Using List Operator---");
	ListIterator<String> l = a1.listIterator();
	while(l.hasNext()) { 
		String s = l.next();
		System.out.println(s);
		
	}
	
	System.out.println("-----Using foe Each-----");
	
	for(String n : a1 ) {
		System.out.println(n);
	}
}
}
