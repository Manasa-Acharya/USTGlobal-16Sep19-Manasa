package com.ustglobal.jpawithibernateapp.jpql;





	

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

	public class DynamicInsert {
		public static void main(String[] args) {

			EntityTransaction transaction = null;
			EntityManager entityManager  = null;
			try {
				EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
				entityManager = entityManagerFactory.createEntityManager();
				transaction = entityManager.getTransaction();
				transaction.begin();
				String jpql = "insert into Product(pid,pname,quantity) values(:id,:name,:quantity)";
				Query query = entityManager.createNativeQuery(jpql);
				query.setParameter("id", 104);
				query.setParameter("name", "ring");
				query.setParameter("quantity", 50);
				int result=query.executeUpdate();
				System.out.println(result);
				transaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}finally {
				entityManager.close();
			}

		}
	}




