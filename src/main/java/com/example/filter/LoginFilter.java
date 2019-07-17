package com.example.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns="/api/*",filterName="loginFilter" )
public class LoginFilter  implements Filter{

	@Override
	public void destroy() {
		System.out.println("destroy LoginFilter");
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter LoginFilter");
		 HttpServletRequest request = (HttpServletRequest) req;
		 HttpServletResponse response = (HttpServletResponse) res;
		 
		/* String username = req.getParameter("username");
		 if("yf".equals(username)) {
			 chain.doFilter(request, response);
		 }else {
			 response.sendRedirect("/index.html");
			 return ;
		 }*/
		 chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init LoginFilter");
		
	}

}
