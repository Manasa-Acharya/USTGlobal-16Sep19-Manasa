package com.ustglobal.typecasting.reference;

public class TestA {
public static void main(String[] args) {
	Pen p=new Marker();//Up casting
	System.out.println(p.cost);
	p.write();
//	System.out.println(p.size); not possible
//	p.color; not possible
	Marker m=(Marker)p;//Down casting
	System.out.println(m.size);
	m.color();
	m.write();

}
}
