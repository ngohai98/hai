package com.ngonhuhai.controller.web;

import com.ngonhuhai.constant.SystemConstant;

import com.ngonhuhai.model.PhoneModel;
import com.ngonhuhai.service.iBrandService;

import com.ngonhuhai.service.iPhoneService;
import com.ngonhuhai.service.impl.BrandService;
import com.ngonhuhai.service.impl.PhoneService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = { "/shop-details" })

public class ShopDetailsController extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 8063278851970985211L;

    private iBrandService brandService=new BrandService();

    private iPhoneService phoneService = new PhoneService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String phoneid=req.getParameter("dt_id");
        String pageStr = req.getParameter("page");
        String maxPageItemStr = req.getParameter("maxPageItem");
        PhoneModel model=new  PhoneModel();
        if(phoneid!=null) {
            Long	id=Long.parseLong(phoneid);
            model=phoneService.findOne(id);
        }
        if (pageStr == null) {

            model.setPage(1);

        } else {
            model.setPage(Integer.parseInt(pageStr));
        }

        if (maxPageItemStr != null) {
            model.setMaxPageItem(Integer.parseInt(maxPageItemStr));
        }
        model.setMaxPageItem(8);

        Integer offset = (model.getPage() - 1) * model.getMaxPageItem();

        model.setTotalItem(phoneService.getTotalItem());
        model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));



        req.setAttribute(SystemConstant.MODEL, model);
        req.setAttribute("brands", brandService.findAll());
        RequestDispatcher rd = req.getRequestDispatcher("/views/web/shops/shop-details.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub

    }
}
