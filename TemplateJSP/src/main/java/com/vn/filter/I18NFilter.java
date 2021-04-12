package com.vn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.vn.controller.Const;

@WebFilter("/*")
public class I18NFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest requestHTTP = (HttpServletRequest) request;
		String language = requestHTTP.getParameter(Const.KEY_LANGUAGE);
		if(language != null) {
			requestHTTP.getSession().setAttribute(Const.KEY_LANGUAGE, language);
		} else {
			requestHTTP.getSession().setAttribute(Const.KEY_LANGUAGE, "en");
		}
		chain.doFilter(request, response);
	}

}
