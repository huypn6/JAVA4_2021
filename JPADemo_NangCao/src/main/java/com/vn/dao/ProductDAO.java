package com.vn.dao;

import java.util.List;

import com.vn.entities.Product;

public interface ProductDAO {
	
	Product create(Product product);

	Product update(Product product);

	Boolean delete(Integer id);

	List<Product> getAll();
}
