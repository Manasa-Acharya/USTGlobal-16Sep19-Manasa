package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestF {
public static void main(String[] args) {
	ArrayList<Marker> a1 = new ArrayList<Marker>();
	a1.add(new Marker(50,"blue"));
	a1.add(new Marker(70,"red"));
	a1.add(new Marker(80,"green"));
	a1.add(new Marker(40,"black"));
	
	System.out.println("Before sorting------>");
	display(a1);
	
//	SortByPrice sb = new SortByPrice();
	SortByColor sc = new SortByColor();
//	Collections.sort(a1, sb);
	Collections.sort(a1,sc);
	
	System.out.println("After sorting------>");
	display(a1);
}
static void display(ArrayList<Marker>a) {
	Iterator<Marker> it = a.iterator();
	while(it.hasNext()) {
		Marker m = it.next();
		System.out.println("price is " + m.price);
		System.out.println("color is " + m.color);
		
	}
}
}

