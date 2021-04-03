package com.vn.service;

import java.util.Date;

import com.vn.dao.FavoriteDAOImpl;
import com.vn.entities.Favorite;
import com.vn.entities.User;
import com.vn.entities.Video;

public class Main {
	
	
	public static void main(String[] args) {
//		ProductDAOImpl dao = new ProductDAOImpl();
//		Product product = new Product();
//		product.setName("huy");
//		product.setDescription("Mo ta");
//		product.setPrice(1100.0);
//		dao.create(product);
//		System.out.println("Done!");
		
		
		FavoriteDAOImpl dao = new FavoriteDAOImpl();
		
		User user = new User();
		Video video = new Video();
		Favorite favorite = new Favorite();
		
		user.setActive(true);
		user.setName("huypn2");
		user.setUsername("huypn2");
		user.setPassword("ITEM");
		favorite.setUser(user);
		
		video.setDescription("VIDEO1");
		video.setName("video1");
		favorite.setVideo(video);
		
		favorite.setLinkDate(new Date());
		
		dao.create(favorite);
		System.out.println("Done!");
		
		
	}
}
