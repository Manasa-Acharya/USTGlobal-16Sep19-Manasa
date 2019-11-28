package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(23.3);
		ts.add(1.5);
		ts.add(90.7);
		ts.add(89.00);
		ts.add(56.7);
		ts.add(90.7);
//		ts.add("deepu");class castException
//		ts.add(nullts);nullpointerException

		System.out.println("*****Using for each***");
		for(Object s :ts) {
			System.out.println(s);
		}

		System.out.println("****using iterator***");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}
}
