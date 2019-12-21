package com.ustglobal.jpawithibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		String jpql = "from Product";
		String jpql ="select pname from Product";
		Query query = entityManager.createQuery(jpql);
//		query.getResultList();
		List<String>pname = query.getResultList();
		for(String product :pname) {
//			System.out.println(product.getPid());
			System.out.println("Name="+product);
//			System.out.println(product.getQuantity());
			System.out.println("------------------");
		
		}
		entityManager.close();

	}//end of the main method
}//end of class