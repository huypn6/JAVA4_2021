package com.vn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.dao.FavoriteDAO;
import com.vn.dao.FavoriteDAOImpl;

@WebServlet("/favorite")
public class FavoriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FavoriteDAO dao = new FavoriteDAOImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dao.create(null);
		super.doPost(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doGet(req, resp);
	}
}
