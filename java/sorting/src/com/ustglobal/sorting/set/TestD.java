package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	LinkedHashSet<Double> ls = new LinkedHashSet();
	ls.add(23.3);
	ls.add(1.5);
	ls.add(90.7);
	ls.add(89.00);
	ls.add(56.7);
	
	System.out.println("*****Using for each***");
	for(Double s :ls) {
		System.out.println(s);
	}
	System.out.println("****using iterator***");
	Iterator <Double>it = ls.iterator();
	while(it.hasNext()) {
		Double p = it.next();
		System.out.println(p);
}
}
}
