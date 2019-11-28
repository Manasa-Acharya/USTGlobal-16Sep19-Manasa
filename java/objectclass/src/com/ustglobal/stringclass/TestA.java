package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		String s1 = "surya";
		String s2 = "teju";

		String s3= new String("surya");
		String s4 = new String("surya");
		String s5 = "surya";

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));

		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);

		boolean b = s1.equalsIgnoreCase("SUrya");
		System.out.println(b);
		System.out.println("-------------------------");
		StringBuffer sb1 = new StringBuffer("Manasa ");
		sb1.append("Acharya");
		System.out.println(sb1);
System.out.println(s1.length());
	}
}
