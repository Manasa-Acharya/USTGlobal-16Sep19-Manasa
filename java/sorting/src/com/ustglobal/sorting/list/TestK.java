package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(45);
		pq.add(60);
		pq.add(9);
		
//		pq.add("hello");
		System.out.println("___using iterator___");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("after poll"+pq);
	}
}
