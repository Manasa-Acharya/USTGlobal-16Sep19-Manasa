package com.ustglobal.jpawithibernateapp;


	
	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.onetomanyormanytoone.Pencil;
import com.ustglobal.jpawithibernateapp.onetomanyormanytoone.PencilBox;

	

	public class TestOneToMany {

	public static void main(String[] args) {
		PencilBox pb = new PencilBox();
		pb.setBid(2);
		pb.setBname("Natraj");
		
		Pencil pencil = new Pencil();
		pencil.setPid(13);
		pencil.setColor("red");
		pencil.setPencilBox(pb);
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(14);
		pencil1.setColor("pink");
		pencil1.setPencilBox(pb);
		
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(pencil);
		entityManager.persist(pencil1);
		System.out.println("Record saved");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
	}


