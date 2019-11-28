package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {
		Pendrive p=new Pendrive();
		USBport.connect(p);

		Mouse m=new Mouse();
		USBport.connect(m);
	}
}
