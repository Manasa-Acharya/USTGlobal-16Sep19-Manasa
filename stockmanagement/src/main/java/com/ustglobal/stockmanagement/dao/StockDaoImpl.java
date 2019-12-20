package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.ustglobal.stockmanagement.dto.StockBean;

@Repository
public class StockDaoImpl implements StockDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addProduct(StockBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}


	}

	@Override
	public boolean modifyProduct(StockBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		StockBean stockBean = manager.find(StockBean.class,bean.getId());
		stockBean.setName(bean.getName());
		stockBean.setCategory(bean.getCategory());
		stockBean.setCompany(bean.getCompany());
		stockBean.setQuantity(bean.getQuantity());
		stockBean.setPrice(bean.getPrice());
		transaction.commit();

		return true;
	}

	@Override
	public StockBean getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from product_info where name=:name";
			TypedQuery<StockBean> typedQuery = manager.createQuery(jpql, StockBean.class);
			typedQuery.setParameter("name", name);
			StockBean stockBean = typedQuery.getSingleResult();
			return stockBean;
		}catch (Exception e) {
			return null;
		}

	}

	@Override
	public List<StockBean> getProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from product_info where company=:company";
		TypedQuery<StockBean> typedQuery = manager.createQuery(jpql, StockBean.class);
		typedQuery.setParameter("company",company);
		return typedQuery.getResultList();

	}

	@Override
	public List<StockBean> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from product_info where category=:category";
		TypedQuery<StockBean> typedQuery = manager.createQuery(jpql, StockBean.class);
		typedQuery.setParameter("category",category);
		return typedQuery.getResultList();

	}

	@Override
	public List<StockBean> getAllProduct() {
		String jpql = "from StockBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<StockBean> query = manager.createQuery(jpql,StockBean.class);
		List<StockBean> stockBeans = query.getResultList();
		return stockBeans;


	}
}
