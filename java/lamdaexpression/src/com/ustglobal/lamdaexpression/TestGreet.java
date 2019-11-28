package com.ustglobal.lamdaexpression;

public class TestGreet {
public static void main(String[] args) {
	GreetInterface  gt=(message) ->{
		System.out.println("Hello");
		System.out.println(message);
	};
	gt.greet("manasa");
}
}
