package com.ngonhuhai.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ngonhuhai.constant.SystemConstant;
import com.ngonhuhai.model.UserModel;
import com.ngonhuhai.utils.SessionUtil;

public class AuthorizationFilter implements Filter{

	private ServletContext context;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.context= filterConfig.getServletContext();
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req= (HttpServletRequest) servletRequest;
		HttpServletResponse resp= (HttpServletResponse) servletResponse;
		String url= req.getRequestURI();
		if(url.startsWith(req.getContextPath()+"/admin")) {
			UserModel  model= (UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL");
			if(model!=null) {
				if(model.getRole().getRole_ten().equals(SystemConstant.ADMIN)){
					chain.doFilter(servletRequest, servletResponse);
				}else if(model.getRole().getRole_ten().equals(SystemConstant.USER)) {
					resp.sendRedirect((req.getContextPath()+"/dang-nhap?action=login&message=not_login&alert=danger"));
				}
			}else {
				resp.sendRedirect((req.getContextPath()+"/dang-nhap?action=login&message=not_permission&alert=danger"));
			}
		}else {
			chain.doFilter(servletRequest, servletResponse);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
