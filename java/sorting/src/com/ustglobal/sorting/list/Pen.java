package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
int price;
String brand;
public Pen(int price, String brand) {
	super();
	this.price = price;
	this.brand = brand;
}
public int compareTo(Pen p) {
	if(this.price <p.price) {
		return -1;
	}else if(this.price>p.price) {
		return 1;

	}else {


		return 0;
	}
}


}
