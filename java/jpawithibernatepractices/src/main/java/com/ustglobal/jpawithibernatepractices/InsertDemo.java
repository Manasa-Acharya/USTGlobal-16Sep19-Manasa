package com.ustglobal.jpawithibernatepractices;



	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatepractices.dto.Student;

	
	public class InsertDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setSid(102);
		student.setSname("Ramya");
		student.setCollegename("VCET");
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		System.out.println("Record saved");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
	}



