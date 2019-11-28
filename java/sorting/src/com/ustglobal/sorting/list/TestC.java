package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(90);
		l.add(89);
		l.add(80);

		Integer peekElement = l.peek();
		System.out.println("Peek Element" +peekElement);

		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek first Element" +peekFirstElement);


		Integer peekLastElement = l.peekLast();

		System.out.println("Peek last Element" +peekLastElement);

		System.out.println("After peek---->"+l);
		
		
		Integer pollElement = l.poll();
		System.out.println("Poll Element" +pollElement);

		Integer pollFirstElement = l.pollFirst();
		System.out.println("Poll first Element" +pollFirstElement);


		Integer pollLastElement = l.pollLast();

		System.out.println("Poll last Element" +pollLastElement);

		System.out.println("After poll---->"+l);

		l.push(12);
		System.out.println("After push------>"+l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("after pop---->" +l);
	}
}
