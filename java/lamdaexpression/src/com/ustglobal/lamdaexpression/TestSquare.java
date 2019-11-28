package com.ustglobal.lamdaexpression;

public class TestSquare {
public static void main(String[] args) {
	SquareInterface sqi = x->x*x;
	System.out.println(sqi.square(6));
	
}
}
