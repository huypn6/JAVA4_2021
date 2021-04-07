package com.vn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.model.User;

@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// logic
		HttpServletRequest requestHttp = (HttpServletRequest) request;
		HttpServletResponse responseHttp = (HttpServletResponse) response;
		User user = (User) requestHttp.getSession().getAttribute("userLogged");
		if(user == null ) {
			requestHttp.getSession().setAttribute("message", "");
			responseHttp.sendRedirect(requestHttp.getContextPath() + "/login");
		} else {
			if(user.getIsAdmin()==null || !user.getIsAdmin()) {
				requestHttp.getSession().setAttribute("message", "Ban khong phai admin");
				responseHttp.sendRedirect(requestHttp.getContextPath() + "/");
			} else {
				requestHttp.getSession().setAttribute("message", "");
				responseHttp.sendRedirect(requestHttp.getContextPath() + "/");
			}
		}
		//chain.doFilter(request, response);
		
	}

}
