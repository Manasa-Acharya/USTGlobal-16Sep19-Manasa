package com.ustglobal.jpawithibernatepractices;



	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatepractices.dto.Student;

	

	public class DeleteDemo {
		public static void main(String[] args) {
			EntityTransaction entityTransaction = null;
			EntityManager entityManager = null;
			try {
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
				entityManager = entityManagerFactory.createEntityManager();
				entityTransaction = entityManager.getTransaction();
				entityTransaction.begin();
				Student student = entityManager.find(Student.class, 101);
				entityManager.remove(student);
				System.out.println("Deleted Record");
				entityTransaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
			entityManager.close();

		}
	


}
