package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(10);
		al.add(9);
		al.add(6);
		al.add(5);
		al.add(8);
		List<Integer> l = al.stream().map(i->i*i).collect(Collectors.toList());
		for(Integer i : l) {
			System.out.println(i);
		}

	}
}


