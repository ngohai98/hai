package com.ngonhuhai.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ngonhuhai.service.iBrandService;

@WebServlet(urlPatterns = {"/admin-home"})
public class HomeController extends HttpServlet{

	@Inject
	private iBrandService brandService;
	/**
	 * 
	 */
	private static final long serialVersionUID = -4924286172611913694L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd= req.getRequestDispatcher("/views/admin/home.jsp");
		rd.forward(req, resp);
	}
}
