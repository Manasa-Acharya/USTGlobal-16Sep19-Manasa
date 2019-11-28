package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

	public int compareTo(Laptop l) {
		if(this.price >l.price) {
			return 1;
		}else if(this.price<l.price) {
			return -1;

		}else {


			return 0;
		}
	}

	
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}




