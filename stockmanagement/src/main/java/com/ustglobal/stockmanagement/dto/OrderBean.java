package com.ustglobal.stockmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class OrderBean {
	@Id
	@GeneratedValue
	@Column
	private int orderId;
	@Column
	private double totalPrice;
	@Column
	private double totalPriceGst;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotalPriceGst() {
		return totalPriceGst;
	}
	public void setTotalPriceGst(double totalPriceGst) {
		this.totalPriceGst = totalPriceGst;
	}
	
	

}
