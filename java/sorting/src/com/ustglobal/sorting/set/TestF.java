package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("manu");
	ts.add("baabu");
	ts.add("surya");
	ts.add("teju");
	ts.add("ankit");
	ts.add("akash");

	System.out.println("*****Using for each***");
	for(String s :ts) {
		System.out.println(s);
	}
	System.out.println("****using iterator***");
	Iterator<String> it = ts.iterator();
	while(it.hasNext()) {
		Object p = it.next();
		System.out.println(p);
}
}
}
