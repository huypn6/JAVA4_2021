package com.vn.service;

import java.util.List;

import com.vn.entities.Product;

public interface ProductService {
	
	Product create(Product product);

	Product update(Product product);

	Boolean delete(Integer id);

	List<Product> getAll(Integer id);
}
