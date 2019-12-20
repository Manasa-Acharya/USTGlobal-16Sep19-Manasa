package com.ustglobal.stockmanagement.service;

import com.ustglobal.stockmanagement.dto.OrderBean;

public interface OrderService {

	public boolean addOrder(OrderBean bean);
	public boolean modifyOrder(OrderBean bean);
	public OrderBean getOrderById(int orderId);
}
