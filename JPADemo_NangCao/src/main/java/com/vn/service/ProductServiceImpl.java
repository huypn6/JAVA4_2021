package com.vn.service;

import java.util.List;

import com.vn.dao.ProductDAO;
import com.vn.dao.ProductDAOImpl;
import com.vn.entities.Product;

public class ProductServiceImpl implements ProductService {
	
	ProductDAO dao = new ProductDAOImpl();

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll(Integer id) {
	
		return null;
	}

}
