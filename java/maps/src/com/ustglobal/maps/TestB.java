package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Surya",7789098);
		hm.put("Ankith",9909098);
		hm.put("Akash",9987098);

		HashMap hm1 = new HashMap();
		hm1.put("Maneesh",8899098);
		hm1.put("Namratha",890989);
		hm1.put("Gogate",990989);
		
		boolean hasKey = hm.containsKey("Ankith");
		System.out.println("has Key " +hasKey);
		
		boolean hasValue = hm.containsValue(9909098);
		System.out.println("has Value " +hasValue);
		hm.putAll(hm1);
		
		System.out.println("-------------");
		System.out.println("After put all " +hm);
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty " +isEmpty);
		
		hm.clear();
		System.out.println("After clear " +hm);
	}
}
