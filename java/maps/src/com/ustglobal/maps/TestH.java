package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
public static void main(String[] args) {
	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	
	ht.put(101, "Ajay");
	ht.put(102, "Vijay");
	ht.put(103, "Abhay");
	ht.put(104, "Ajith");
	ht.put(101, "jay");
	ht.put(1, "Ankit");
	ht.put(901, "Akash");
	ht.put(511, "Geetha");
	ht.put(655, "Chukra");
	ht.put(2, "Sheep");
		/*
		 * ht.put(null, "Ajay");null exception
		 */	
//	ht.put(108, null);null value exception
	 System.out.println("Data " + ht);
	
}
}
