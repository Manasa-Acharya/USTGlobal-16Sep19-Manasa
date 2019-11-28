package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i->i*i;

		int res = f.apply(5);
		System.out.println("Square is "+res);
		
		int res1 = f.apply(90);
		System.out.println("Square is "+res1);
		
		int res2 = f.apply(25);
		System.out.println("Square is "+res2);
	}
}
