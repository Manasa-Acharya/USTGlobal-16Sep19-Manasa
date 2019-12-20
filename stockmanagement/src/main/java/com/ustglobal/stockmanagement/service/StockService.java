package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.StockBean;

public interface StockService {

	public boolean addProduct(StockBean bean);
	public boolean modifyProduct(StockBean bean);
	public StockBean getProductByName(String name);
	public List<StockBean> getProductByCategory(String category);
	public List<StockBean> getProductByCompany(String company);
	public List<StockBean> getAllProduct();


}
