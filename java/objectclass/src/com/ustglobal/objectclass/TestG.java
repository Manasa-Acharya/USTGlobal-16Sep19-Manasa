package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"surya",50000);
		Employee e2 = new Employee(112,"sandeep",60000);
		Employee e3 = new Employee(111,"surya",50000);
		Employee e4 = e3;
		boolean isEqual = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));

		System.out.println(isEqual);
		System.out.println("--------------------");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}
}
