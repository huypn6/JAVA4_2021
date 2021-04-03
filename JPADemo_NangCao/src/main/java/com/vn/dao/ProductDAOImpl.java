package com.vn.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.vn.entities.Product;
import com.vn.util.PersistenceUtil;

public class ProductDAOImpl implements ProductDAO {
	static EntityManagerFactory factory =  PersistenceUtil.getFactory();
	
	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(product);
		System.out.println("Done");
		entityManager.getTransaction().commit();
		entityManager.close();
		return product;
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
	public List<Product> getAll() {
		List<Product> list = new ArrayList<Product>();
		Product product = new Product();
		product.setId(1);
		product.setName("hELLO");
		list.add(product);
		list.add(product);
		list.add(product);
		list.add(product);
		list.add(product);
		return list;
	}

}
