package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c1 = new Car(2222,"ford" , "red");
		int h1 = c1.hashCode();
		System.out.println("h1 is "+h1);
		System.out.println(c1);
		
		
		Car c2 = new Car(2222,"benz" , "black");
		int h2 = c2.hashCode();
		System.out.println("h2 is "+h2);
		System.out.println(c2);
		
		Car c3 = new Car(1772,"creta" , "silver");
		int h3 = c3.hashCode();
		System.out.println("h3 is "+h3);
		System.out.println(c3);
	}
}
