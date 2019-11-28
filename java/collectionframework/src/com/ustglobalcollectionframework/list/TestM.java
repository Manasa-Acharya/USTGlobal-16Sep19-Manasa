package com.ustglobalcollectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("surya");
	al.add("Tejaswi");
	al.add("Ankith");
	al.add("Manasa");
	
	System.out.println("Before sort--->"+al);
	Collections.sort(al);
	System.out.println("After sort---->"+al);
}
}
