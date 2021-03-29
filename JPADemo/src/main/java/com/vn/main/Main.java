package com.vn.main;

import javax.persistence.EntityManager;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;

import com.vn.entities.Product;
import com.vn.util.HibernateUtil;

public class Main {
	
	
	public static void main(String[] args) {
		SessionFactory factory =  HibernateUtil.getFactory();
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		Product product = new Product();
		product.setDescription("Mo tat");
		product.setName("Poly");
		product.setPrice(20000.0);
		
		entityManager.persist(product);
		
		System.out.println("Done");
		entityManager.close();
	}
	
	
}
