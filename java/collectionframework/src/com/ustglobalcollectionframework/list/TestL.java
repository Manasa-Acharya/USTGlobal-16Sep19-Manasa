package com.ustglobalcollectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
public static void main(String[] args) {
	LinkedList<Integer> l= new LinkedList<Integer>();
	l.add(12);
	l.add(56);
	l.add(90);
	l.add(10);
	l.add(99);
	System.out.println("Before sort" +l);
	
	Collections.sort(l);
	System.out.println("After sort"+l);
	
	Collections.reverse(l);
	System.out.println("Aft reverse"+l);
	
	Collections.shuffle(l);
	System.out.println("After shuffle"+l);
}
}
