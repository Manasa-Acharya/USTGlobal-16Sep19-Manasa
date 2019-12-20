package com.ustglobal.stockmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;


import com.ustglobal.stockmanagement.dto.OrderBean;


@Repository
public class OrderDaoImpl implements OrderDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addOrder(OrderBean bean) {
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
	public boolean modifyOrder(OrderBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		OrderBean orderBean = manager.find(OrderBean.class,bean.getOrderId());
		orderBean.setTotalPrice(bean.getTotalPrice());
		orderBean.setTotalPriceGst(bean.getTotalPriceGst());

		transaction.commit();

		return true;
	}

	@Override
	public OrderBean getOrderById(int orderId) {

		EntityManager manager = factory.createEntityManager();
		OrderBean bean = manager.find(OrderBean.class, orderId);
		return bean;

	}
}
