package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Surya",7789098);
		hm.put("Ankith",9909098);
		hm.put("Akash",9987098);
		hm.put(null,9087098);
		hm.put(null,7887098);
		
		System.out.println("Data"+hm);
		
		hm.put("Surya", 990909);
		System.out.println("After modify"+hm);
		hm.put("Maneesh", 990909);
		System.out.println("After Maneesh"+hm);
		System.out.println("After null "+hm);
		System.out.println("----------------");
		System.out.println("After adding duplicated null"+hm);
	
	Object phno = hm.get("Ankith");
	System.out.println("Value " + phno);
	
	Object phno1 = hm.get("Pavan");
	System.out.println("Value " + phno1);
	
	
	Object value = hm.remove("Maneesh");
	System.out.println("Value " + value);
	
	System.out.println("After removing-----"+hm);
	}
}
