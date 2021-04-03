package com.vn.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.vn.entities.Favorite;
import com.vn.util.PersistenceUtil;

public class FavoriteDAOImpl implements FavoriteDAO {

	static EntityManagerFactory factory = PersistenceUtil.getFactory();

	@Override
	public Favorite create(Favorite favorite) {
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(favorite.getUser());
		entityManager.persist(favorite.getVideo());
		entityManager.persist(favorite);

		entityManager.getTransaction().commit();
		entityManager.close();

		return favorite;
	}

}
