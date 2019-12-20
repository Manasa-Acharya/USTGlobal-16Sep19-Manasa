package com.ustglobal.stockmanagement.dao;

import com.ustglobal.stockmanagement.dto.OrderBean;


public interface OrderDAO {

	public boolean addOrder(OrderBean bean);
	public boolean modifyOrder(OrderBean bean);
	public OrderBean getOrderById(int orderId);
}
