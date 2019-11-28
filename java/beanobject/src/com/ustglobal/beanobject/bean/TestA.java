package com.ustglobal.beanobject.bean;

public class TestA {
public static void main(String[] args) {
	Student s = new Student();
	s.setId(12);
	s.setName("Tejasvi");
	s.setRollNo(134);
	 
	Database db = new Database();
	db.receive(s);
	
	Employee e = new Employee();
	e.setId(111);
	e.setName("Manasa");
	e.setSalary(3000000);
	
	
	
	db.save(e);
}
}
