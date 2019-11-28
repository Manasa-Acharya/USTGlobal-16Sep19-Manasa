package com.ustglobalcollectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(98.0);
		al.add(true);
		al.add("good evening");
		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("ob1"+o1);

		Object o2 = it.next();
		System.out.println("ob2"+o2);

		Object o3 = it.next();
		System.out.println("ob3"+o3);

		Object o4 = it.next();
		System.out.println("ob4"+o4);
		boolean b = it.hasNext();
		System.out.println("HasNext" +b);
		//	Object o5 = it.next();
		//	System.out.println("ob5"+o5);
		//			no such element

		System.out.println("------forloop----------");
		for(int i = 0;i<al.size();i++) {
			Object o =al.get(i);
			System.out.println(o);
		}
		ArrayList all = new ArrayList();
		all.add(12);
		all.add(233.33);
		all.add("moon");
		all.add(false);

		System.out.println("------------Using Iterator---------");
		Iterator it1 = all.iterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}
		System.out.println("---------forloop------");
//		for(;it1.hasNext();) {
//			Object ob = it1.next();
//			System.out.println(ob);
//		}

	}
}
