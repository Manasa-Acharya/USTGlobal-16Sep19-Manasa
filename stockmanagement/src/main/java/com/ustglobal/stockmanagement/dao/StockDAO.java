package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.StockBean;

public interface StockDAO {

	public boolean addProduct(StockBean bean);
	public boolean modifyProduct(StockBean bean);
	public StockBean getProductByName(String name);
	public List<StockBean> getProductByCategory(String category);

	public List<StockBean> getProductByCompany(String category);
	public List<StockBean> getAllProduct();




}
