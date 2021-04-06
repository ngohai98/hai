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
import com.ngonhuhai.model.PhoneModel;
import com.ngonhuhai.service.iBrandService;
import com.ngonhuhai.service.iPhoneService;
import com.ngonhuhai.service.impl.BrandService;
import com.ngonhuhai.service.impl.PhoneService;
import com.ngonhuhai.utils.MessageUtil;

@WebServlet(urlPatterns = { "/admin-phonelist" })
public class PhoneController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1448682093369612638L;


	private iPhoneService phoneService = new PhoneService();

	private iBrandService brandService = new BrandService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type = req.getParameter("type");
		PhoneModel model = new PhoneModel();
		String view = "";
		String id = req.getParameter("id");
		if (type != null && type.equals(SystemConstant.LIST)) {
			String pagestr = req.getParameter("page");
			String maxpageitemstr = req.getParameter("maxPageItem");
			if (pagestr != null) {
				model.setPage(Integer.parseInt(pagestr));
			}
			if (maxpageitemstr != null) {
				model.setMaxPageItem(Integer.parseInt(maxpageitemstr));
			}
			Integer offset = (model.getPage() - 1) * model.getMaxPageItem();
			model.setListResult(phoneService.findAll(offset, model.getMaxPageItem()));

			model.setTotalItem(phoneService.getTotalItem());
			model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
			req.setAttribute(SystemConstant.MODEL, model);
			view = "/views/admin/phone/list.jsp";
		} else if (type != null && type.equals(SystemConstant.EDIT)) {
			if (id != null) {
				model = phoneService.findOne(Long.parseLong(id));
			}
			req.setAttribute("brands", brandService.findAll());
			view = "/views/admin/phone/edit.jsp";
		}
		MessageUtil.showMessage(req);
		req.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = req.getRequestDispatcher(view);
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
