package com.ngonhuhai.controller;

import com.ngonhuhai.model.UserModel;
import com.ngonhuhai.service.iUserService;
import com.ngonhuhai.service.impl.UserService;
import com.ngonhuhai.utils.SessionUtil;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = { "/dang-nhap", "/thoat" })
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2889322817021108775L;


	private iUserService userService=new UserService();
	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = req.getParameter("action");
		if (action != null && action.equals("login")) {
			String alert = req.getParameter("alert");
			String message = req.getParameter("message");

			if (message != null && alert != null) {
				req.setAttribute("message", resourceBundle.getString(message));
				req.setAttribute("alert", alert);
			}
			RequestDispatcher rd = req.getRequestDispatcher("/views/web/login.jsp");
			rd.forward(req, resp);
		} else if (action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(req, "USERMODEL");
			resp.sendRedirect(req.getContextPath() + "/home");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = req.getParameter("action");
		if (action != null && action.equals("login")) {

			UserModel model = new UserModel();
			model.setUser_ten(req.getParameter("username"));
			model.setUser_matkhau(req.getParameter("password"));


			model = userService.findByUserPass(model.getUser_ten(), model.getUser_matkhau());
			if (model != null) {
				SessionUtil.getInstance().putValue(req, "USERMODEL", model);
				if (model.getRole().getRole_ten().equals("user")) {
					resp.sendRedirect(req.getContextPath() + "/home");
				} else if (model.getRole().getRole_ten().equals("admin")) {
					resp.sendRedirect(req.getContextPath() + "/admin-home");
				}
			} else {
				resp.sendRedirect(req.getContextPath()
						+ "/dang-nhap?action=login&message=username_password_invalid&alert=danger");
			}
		}
	}
}
