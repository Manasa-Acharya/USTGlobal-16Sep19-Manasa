package com.ustglobal.stockmanagement.dto;

import java.util.List;


public class StockResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<StockBean> stockbeans;
	public List<StockBean> getStockbeans() {
		return stockbeans;
	}
	public void setStockbeans(List<StockBean> stockbeans) {
		this.stockbeans = stockbeans;
	}
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

}
