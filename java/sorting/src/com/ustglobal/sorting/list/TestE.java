package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
public static void main(String[] args) {
	LinkedList<Pen> p = new LinkedList<Pen>();
	Pen p1 = new Pen(70,"cello");
	Pen p2 = new Pen(10,"renolds");
	Pen p3 = new Pen(30," writo meter");
	Pen p4 = new Pen(20,"Inkpen");
	
	
	p.add(p1);
	p.add(p2);
	p.add(p3);
	p.add(p4);
	displayPenDetails(p);
	Collections.sort(p);
	displayPenDetails(p);
}
	static void displayPenDetails(LinkedList<Pen>p) {
		Iterator<Pen> it = p.iterator();
		while(it.hasNext()) {
			Pen pe = it.next();
			System.out.println("price is " + pe.price);
			System.out.println("brand is " + pe.brand);
			
		}
}

}
