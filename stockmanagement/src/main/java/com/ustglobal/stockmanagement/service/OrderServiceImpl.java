package com.ustglobal.stockmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.OrderDAO;
import com.ustglobal.stockmanagement.dao.StockDAO;
import com.ustglobal.stockmanagement.dto.OrderBean;

@Service
public class OrderServiceImpl implements OrderService {


	@Autowired
	private OrderDAO dao; 

	@Override
	public boolean addOrder(OrderBean bean) {

		return dao.addOrder(bean);
	}

	@Override
	public boolean modifyOrder(OrderBean bean) {

		return dao.modifyOrder(bean);
	}

	@Override
	public OrderBean getOrderById(int orderId) {

		return dao.getOrderById(orderId);
	}

}
