package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestH {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student(5,"anu",89.0));
	al.add(new Student(4,"ashu",29.0));
	al.add(new Student(9,"ani",69.0));
	al.add(new Student(2,"manu",99.0));
	al.add(new Student(1,"ankit",79.0));
	
	Helper h = new Helper();
h.displayFailedStudents(al);

}
}
