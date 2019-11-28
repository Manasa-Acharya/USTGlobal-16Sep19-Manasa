package com.ustglobalcollectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
public static void main(String[] args) {
	LinkedList li = new LinkedList();
	
	li.add("anu");
	li.add("surya");
	li.add("teju");
	li.add("ashu");
	
	System.out.println("-----Using for loop----");
	for(int i= 0 ;i<li.size();i++) {
		System.out.println(li.get(2));
	}
	
	System.out.println("-----------------");
	for(Object object : li) {
		System.out.println(object);
	}
	
	System.out.println("----Using iterator----");
	Iterator it = li.iterator();
	while(it.hasNext()) {
		Object o = it.next();
		System.out.println(o);
	}
	System.out.println("-------using list iterator forward---");
	
	ListIterator It = li.listIterator();
	while(It.hasNext()) {
		Object o = It.next();
		System.out.println(o);
		
	}
System.out.println("-------using list iterator backward---");
	
	ListIterator Lt = li.listIterator();
	while(Lt.hasPrevious()) {
		Object o = Lt.previous();
		System.out.println(o);
		
	}
	
	
	
	
}
}
