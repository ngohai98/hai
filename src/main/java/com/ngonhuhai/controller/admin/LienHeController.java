package com.ngonhuhai.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ngonhuhai.constant.SystemConstant;
import com.ngonhuhai.model.LienHeModel;
import com.ngonhuhai.model.UserModel;
import com.ngonhuhai.service.iLienHeService;
import com.ngonhuhai.service.impl.LienHeService;

@WebServlet(urlPatterns = {"/admin-lienhelist"})
public class LienHeController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5707917278366425351L;

	private iLienHeService lienHeService = new LienHeService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LienHeModel model= new LienHeModel();
		String pagestr=req.getParameter("page");
		String maxpageitemstr=req.getParameter("maxPageItem");
		if(pagestr!=null) {
			model.setPage(Integer.parseInt(pagestr));
		}
		if(maxpageitemstr!=null) {
			model.setMaxPageItem(Integer.parseInt(maxpageitemstr));
		}
		Integer offset=(model.getPage()-1)*model.getMaxPageItem();
		model.setListResult(lienHeService.findAll(offset, model.getMaxPageItem()));
		model.setTotalItem(lienHeService.getTotalItem());
		model.setTotalPage((int)Math.ceil((double)model.getTotalItem()/model.getMaxPageItem()));
		req.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/lienhe/list.jsp");
		rd.forward(req, resp);
	}

}
