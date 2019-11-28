package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Main strted");

		int a = 10;

		int b = 0;
		try {
			b=10/0;
			System.out.println(b);
			System.out.println("hello");
			System.out.println("Hppy Deepavali");
		}catch(ArithmeticException ae) {
			System.out.println("number divided by zero");

		}
		System.out.println("Main ended");

	}
}
