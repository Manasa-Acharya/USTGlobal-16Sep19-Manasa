package com.ustglobalcollectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
public static void main(String[] args) {
	ArrayList<Double> a1=new ArrayList<Double>();
	a1.add(34.4);
	a1.add(89.9);
	a1.add(88.0);
	a1.add(12.20);
	a1.add(34.4);
	a1.add(null);
	System.out.println(a1);
	
	a1.add(2,34.4);
	System.out.println("After add in 2nd index" +a1);
	a1.remove(0);
	System.out.println("After remove of 0th index"+a1);
	a1.remove(null);
	System.out.println("After removng null" +a1);
	Double val = a1.get(4);
	System.out.println("Object at 4th index"+val);
	a1.set(2, 55.5);
	System.out.println("After replacing method " +a1);
	a1.clear();
	System.out.println("After clear method" +a1);
	a1.contains(54.4);
	System.out.println("------------------------");
	List<Double> al1 = new ArrayList<>();
	al1.add(12.3);
	al1.add(45.5);
	al1.add(90.0);
	
	a1.addAll(al1);
	System.out.println("After add all" +a1);
	
	boolean contain = a1.containsAll(al1);
	System.out.println("Contains all of al1" +contain);
	System.out.println("Before remove" +a1);
	boolean res = a1.removeAll(al1);
	System.out.println("Removed all of al1 " +res);
	System.out.println("After remove "+a1);
	
	
}
}
