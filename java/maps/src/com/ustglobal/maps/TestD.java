package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> lh = new LinkedHashMap<String,Integer>();
	lh.put("Bengaluru", 560004);
	lh.put("Sagar", 577401);
	lh.put("Mangaluru", 567802);

	
	for(Map.Entry<String, Integer> m : lh.entrySet()) {
		String Key = m.getKey();
		Integer value = m.getValue();
		System.out.println("Key is " +Key+ " ------"+ " Value "+value);
		System.out.println("--------------------");
	}
}
}
