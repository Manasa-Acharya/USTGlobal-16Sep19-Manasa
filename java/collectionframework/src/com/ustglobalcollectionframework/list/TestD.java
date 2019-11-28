package com.ustglobalcollectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(29.9);
		al.add(true);
		al.add("teju");


		ListIterator li = al.listIterator();
		System.out.println("==========forward====");
		while(li.hasNext()) { 
			Object o = li. next();
			System.out.println(o);
		}
		System.out.println("========Backward========");




		while(li.hasPrevious()) { 
			Object o = li. previous();
			System.out.println(o);
		}
	}
}
