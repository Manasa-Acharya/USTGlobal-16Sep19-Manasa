package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
LinkedHashMap<String,Integer> lh = new LinkedHashMap<String,Integer>();
lh.put("Bengaluru", 560004);
lh.put("Sagar", 577401);
lh.put("Mangaluru", 567802);


System.out.println(lh);

Set<String> s = lh.keySet();
for(String key : s) {
	System.out.println("key " +key);
}
System.out.println("--------------------------");
Collection<Integer> c = lh.values();

for(Integer Value : c) {
	System.out.println("Value " +Value);
}
	}
}
