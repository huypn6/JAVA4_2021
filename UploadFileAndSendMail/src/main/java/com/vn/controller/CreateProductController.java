package com.vn.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.vn.entities.Product;

@MultipartConfig
@WebServlet("/product/create")
public class CreateProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("create_product.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		Collection<Part> parts = req.getParts();
		Product product = new Product();
		product.setName(name);
		int index = 0;
		System.out.println(parts.size());
		for (Part part : parts) {
			
			//1. get name file
			String fileNameBase = part.getSubmittedFileName();
			System.out.println(fileNameBase);
			
			//2. create link web file
			String fileWeb = "/static/files/" + fileNameBase;
			
			//3. convert link web file => real link file
			String fileRealPath = req.getServletContext().getRealPath(fileWeb);
			
			//4. write file
			part.write(fileRealPath);
			
			//5. save link to product
			if(index == 0)
				product.setUrl1(fileNameBase);
			if(index == 1)
				product.setUrl2(fileNameBase);
			if(index == 2)
				product.setUrl3(fileNameBase);
			if(index == 3)
				product.setUrl4(fileNameBase);
			//6. save product
			index++;
		}
		System.out.println(product);
	}
}
