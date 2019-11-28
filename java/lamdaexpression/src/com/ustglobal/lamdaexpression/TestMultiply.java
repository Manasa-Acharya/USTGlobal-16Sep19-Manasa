package com.ustglobal.lamdaexpression;

public class TestMultiply {
	public static void main(String[] args) {
		MultiplyInterface multi = (a,b)->a*b;
		int prod = multi.multiply(10, 20);
		System.out.println("prod is "+prod);
	}
}
