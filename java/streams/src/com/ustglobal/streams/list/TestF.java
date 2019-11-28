package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(27);
	al.add(100);
	al.add(90);
	al.add(60);
	al.add(17);
	al.add(80);
	
	List<Integer> l = al.stream().sorted().collect(Collectors.toList());
	Iterator<Integer> it = l.iterator();
	System.out.println("sorted--------------");
	while(it.hasNext()) {
		Integer  i = it.next();
		
		System.out.println(i);
	}
}
}
