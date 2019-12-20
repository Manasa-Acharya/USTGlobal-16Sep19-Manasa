package com.ustglobal.stockmanagement.dto;

import java.util.List;

public class OrderResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<OrderBean> orderbeans;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<OrderBean> getOrderbeans() {
		return orderbeans;
	}
	public void setOrderbeans(List<OrderBean> orderbeans) {
		this.orderbeans = orderbeans;
	}
}
