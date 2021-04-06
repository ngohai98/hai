package com.ngonhuhai.controller.web;

import com.ngonhuhai.constant.SystemConstant;
import com.ngonhuhai.model.GiohangModel;
import com.ngonhuhai.model.UserModel;
import com.ngonhuhai.service.iBrandService;
import com.ngonhuhai.service.iGioHangService;
import com.ngonhuhai.service.impl.BrandService;
import com.ngonhuhai.service.impl.GioHangService;
import com.ngonhuhai.utils.SessionUtil;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = { "/cart" })
public class CartController extends HttpServlet {
    private static final long serialVersionUID = -5204985784575677376L;

    private iGioHangService giohangService=new GioHangService();

    private iBrandService brandService=new BrandService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String page = req.getParameter("page");
        String maxPageItem = req.getParameter("maxPageItem");
        UserModel userModel = (UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL");
        if (userModel == null) {
            resp.sendRedirect((req.getContextPath() + "/dang-nhap?action=login&message=not_login&alert=danger"));
        } else {
            GiohangModel giohangModel = new GiohangModel();
            if (page != null && maxPageItem != null) {

                Integer pages = Integer.parseInt(page);
                Integer maxPageItems = Integer.parseInt(maxPageItem);

                giohangModel.setMaxPageItem(maxPageItems);

                giohangModel.setPage(pages);
                Integer offset = (giohangModel.getPage() - 1) * giohangModel.getMaxPageItem();
                giohangModel.setTotalItem(giohangService.getTotalItem());
                giohangModel.setTotalPage((int) Math.ceil((double) giohangModel.getTotalItem() / giohangModel.getMaxPageItem()));
                giohangModel.setListResult(giohangService.findAll(offset, giohangModel.getMaxPageItem(), userModel.getUser_id()));
                req.setAttribute(SystemConstant.MODEL, giohangModel);
                req.setAttribute("brands", brandService.findAll());
                RequestDispatcher rd = req.getRequestDispatcher("/views/web/cart.jsp");
                rd.forward(req, resp);

            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserModel userModel = (UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL");
        if (userModel == null) {
            resp.sendRedirect((req.getContextPath() + "/dang-nhap?action=login&message=not_login&alert=danger"));
        }

    }

}
